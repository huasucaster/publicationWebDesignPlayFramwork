package controllers;

import com.avaje.ebean.SqlRow;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.Conference;
import models.pub_info;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;


import javax.json.JsonObject;
import java.util.ArrayList;
import java.util.List;
/**
 * File Name: PubController.java
 *
 * PubController handles data management for Publication
 * metadata and interaction with MySQL database.
 *
 * @author Beichen Hu, John Reynolds, Jianyu Shen, Jiachen Tang
 * @date March 7th, 2021
 * @since 1.0
 */
public class PubController extends Controller {

    public Result partOneQueryOne() {
        System.out.println("In PartOneQueryOne");
        JsonNode req = request().body().asJson();
        String title = req.get("title").asText();
        System.out.println("receive title: "+title);
        try {
            List<ObjectNode> query1_1=getMetadataUsingPaperName(title);
            if (title.equals("")){
                return ok("false");
            } else return ok(query1_1.toString());

        }
        catch (Exception e) {
            return ok("false");
        }
    }

    public Result partOneQueryTwo() {

        System.out.println("In PartOneQueryTwo");
        JsonNode req = request().body().asJson();
        String journal = req.get("journal").asText();
        int volume = req.get("volume").asInt();
        int number = req.get("pub_number").asInt();
        System.out.println("receive title: "+journal);
        System.out.println("receive volume: "+volume);
        System.out.println("receive number: "+number);
        try {
            List<ObjectNode> query1_2 = getMetadataUsingJournalVolumeAndNumber(journal, volume, number);
            return ok(query1_2.toString());

        }
        catch (Exception e) {
            return ok("false");
        }
    }

    public Result partOneQueryThree() {

        System.out.println("In PartOneQueryThree");
        JsonNode req = request().body().asJson();
        String author = req.get("author").asText();
        System.out.println(req);
        int pub_year = req.get("pub_year").asInt();
        System.out.println("receive reasearcher name = "+author);
        System.out.println("pub_year = "+pub_year);
        try {
            List<SqlRow> pub = pub_info.findByTitle_1_3(author,pub_year); // ( match where username and password both match )
            System.out.println(pub.get(0)!= null);

            List<ObjectNode> query1_3= getTitlesUsingAuthorAndYear(author,pub_year);

                return ok(query1_3.toString());

        }
        catch (Exception e) {
            return ok("false");
        }
    }

    public Result partOneQueryFour() {

        System.out.println("In PartOneQueryFour");

        try {
            List<SqlRow> pub = pub_info.findByAuthor_1_4(); // ( match where username and password both match )
            System.out.println(pub.get(0)!= null);

            List<ObjectNode> query1_4 = getAuthorsWhosePaperMoreThanTen();

                return ok(query1_4.toString());

        }
        catch (Exception e) {
            return ok("false");
        }
    }

    public Result partOneQueryFive() {
        System.out.println("In PartOneQueryFive");
        try {
            JsonNode req = request().body().asJson();
            String confName = req.get("name").asText();
            int year = req.get("year").asInt();
            System.out.println("Receive Conf Name: " + confName);
            System.out.println("Receive Conf Year: " + year);
            List<ObjectNode> query1_5= getLoacationFromConfNameAndYear(confName,year);
                return ok(query1_5.toString());
        }
        catch (Exception e) {
            return ok("false");
        }
    }

    public Result partTwoQueryOne(){
        System.out.println("In PartTwoQueryOne");
        JsonNode req = request().body().asJson();
        String author = req.get("author").asText();
        System.out.println(req);
        int pub_year = req.get("pub_year").asInt();
        System.out.println("receive reasearcher name = "+author);
        System.out.println("pub_year = "+pub_year);
        try {
            List<SqlRow> pub = pub_info.findByTitle_1_3(author,pub_year); // ( match where username and password both match )
            System.out.println(pub.get(0)!= null);
            List<ObjectNode> query2_1_metadata=new ArrayList<>();
            List<ObjectNode> query2_1_title= getTitlesUsingAuthorAndYear(author,pub_year);
            for(int i=0;i<query2_1_title.size();i++) {
                List<ObjectNode> temp=new ArrayList<>();
                temp=getMetadataUsingPaperName(query2_1_title.get(i).findValue("title").asText());
                for(int k=0;k<temp.size();k++) {
                    query2_1_metadata.add(temp.get(k));
                }
            }
            System.out.println("result: "+query2_1_metadata);
            return ok(query2_1_metadata.toString());

        }
        catch (Exception e) {
            return ok("false");
        }
    }

    public Result partTwoQueryTwo(){
        System.out.println("In PartTwoQueryTwo");

        try {
            List<SqlRow> pub = pub_info.findByAuthor_1_4();
            System.out.println(pub.get(0)!= null);
            List<ObjectNode> query2_2_Coauthor=new ArrayList<>();
            List<ObjectNode> query2_2_Author = getAuthorsWhosePaperMoreThanTen();
            for(int i=0;i<query2_2_Author.size();i++){
                List<ObjectNode> temp=new ArrayList<>();
                String author=query2_2_Author.get(i).findValue("author").asText();
                temp=getCoauthorForProductiveAuthor(author);
                List<String> coauthor=new ArrayList<>();
                for(int k=0;k<temp.size();k++) {
                    coauthor.add(temp.get(k).findValue("author").asText());
                }
                ObjectNode authorWithCoauthor=Json.newObject();
                authorWithCoauthor.put("author",author);
                authorWithCoauthor.put("coauthor",coauthor.toString());
                query2_2_Coauthor.add(authorWithCoauthor);
            }

            System.out.println("result: "+query2_2_Coauthor);

            return ok(query2_2_Coauthor.toString());
        }
        catch (Exception e) {
            return ok("false");
        }
    }

    public Result partTwoQueryThree(){
        System.out.println("In PartTwoQueryThree");
        JsonNode req = request().body().asJson();
        String name = req.get("name").asText();
        int yearFrom = req.get("yearFrom").asInt();
        int yearTo = req.get("yearTo").asInt();
        System.out.println("receive name: "+name);
        System.out.println("receive yearFrom: "+yearFrom);
        System.out.println("receive yearTO: "+yearTo);

        try {
            List<ObjectNode> query2_3_ConMetadata = new ArrayList<>();
            for(int i=yearFrom;i<=yearTo;i++) {
                List<ObjectNode> query2_3_Con = getLoacationFromConfNameAndYear(name,i);
                query2_3_ConMetadata.add(query2_3_Con.get(0));
                System.out.println("result: " + query2_3_Con);
            }

            return ok(query2_3_ConMetadata.toString());

        }
        catch (Exception e) {
            return ok("false");
        }
    }

    public Result findAll(){
        List<pub_info> pubs = pub_info.findAll();
        System.out.println(pubs);
        return ok(views.html.publist.render(pubs));
    }

    /**
     * Query 1.1
     */
    public List<ObjectNode> getMetadataUsingPaperName(String title) {
        List<ObjectNode> reslist= new ArrayList<>();
        try {
                List<SqlRow> pub = pub_info.findByTitle_1_1(title);

                if (pub.size()!= 0) {
                    for (SqlRow pubs : pub) {
                        ObjectNode res = Json.newObject();
                        res.put("pid", pubs.get("pid").toString());
                        res.put("title", (String)pubs.get("title"));
                        res.put("mdate", (String)pubs.get("mdate"));
                        res.put("author",(String) pubs.get("author"));
                        res.put("author_list", pubs.get("author_list").toString());
                        res.put("article_key",(String) pubs.get("article_key"));
                        res.put("editors",(String)pubs.get("editors"));
                        res.put("pages", (String)pubs.get("pages"));
                        res.put("ee", (String)pubs.get("ee"));
                        res.put("pub_url", (String)pubs.get("pub_url"));
                        res.put("pub_year", pubs.get("pub_year").toString());
                        res.put("journal", (String)pubs.get("journal"));
                        res.put("book_title",(String) pubs.get("book_title"));
                        res.put("volume", pubs.get("volume").toString());
                        res.put("pub_number",pubs.get("pub_number").toString());
                        res.put("publisher", (String)pubs.get("publisher"));
                        res.put("isbn", (String)pubs.get("isbn"));
                        res.put("series", (String)pubs.get("series"));
                        res.put("cross_ref",(String) pubs.get("cross_ref"));
                        System.out.println(res);
                        reslist.add(res);
                    }
                    System.out.println(reslist);
                } else {
                    System.out.println(reslist.toString());
                }
            }
            catch (Exception e) {
                System.out.println(e);
            }
            return reslist;
    }

    /**
     * Query 1.2
     */
    public List<ObjectNode> getMetadataUsingJournalVolumeAndNumber(String journalName, int volume, int number) {
        List<ObjectNode> reslist = new ArrayList<>();
        try {
            List<SqlRow> pub = pub_info.findByJournal_1_2(journalName, volume, number);
            System.out.println(pub.size());
            System.out.println(pub.size()!=0);

            if (pub.size()!=0) {
                int i=0;
                for (SqlRow pubs : pub) {
                    i++;
                    ObjectNode res = Json.newObject();
                    res.put("title", (String)pubs.get("title"));
                    res.put("mdate", (String)pubs.get("mdate"));
                    res.put("author_list", pubs.get("author_list").toString());
                    res.put("article_key",(String) pubs.get("article_key"));
                    res.put("editors",(String)pubs.get("editors"));
                    res.put("pages", (String)pubs.get("pages"));
                    res.put("ee", (String)pubs.get("ee"));
                    res.put("pub_url", (String)pubs.get("pub_url"));
                    res.put("journal", (String)pubs.get("journal"));
                    res.put("pub_year", pubs.get("pub_year").toString());
                    res.put("volume", pubs.get("volume").toString());
                    res.put("pub_number",pubs.get("pub_number").toString());
                    reslist.add(res);
                }
                System.out.println(reslist);
            } else {
                System.out.println(reslist.toString());
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return reslist;
    }

    /**
     * Query 1.3
     */
    public List<ObjectNode> getTitlesUsingAuthorAndYear (String author, int pub_year) {
        List<ObjectNode> reslist = new ArrayList<>();
        try {
            List<SqlRow> pub = pub_info.findByTitle_1_3(author,pub_year);
            System.out.println(pub.get(0)!= null);
            if (pub.get(0)!= null) {
                int i=0;
                for (SqlRow pubs : pub) {
                    i++;
                    ObjectNode res = Json.newObject();
                    res.put("title", (String)pubs.get("title"));
                    System.out.println(res);
                    reslist.add(res);
                }
                System.out.println(reslist);
            } else {
                System.out.println(reslist);
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return reslist;
    }

    /**
     * Query 1.4
     */
    public List<ObjectNode> getAuthorsWhosePaperMoreThanTen() {
        List<ObjectNode> reslist = new ArrayList<>();
        try {
            List<SqlRow> pub = pub_info.findByAuthor_1_4();
            System.out.println(pub.get(0)!= null);

            if (pub.get(0)!= null) {
                int i=0;
                for (SqlRow pubs : pub) {
                    i++;
                    ObjectNode res = Json.newObject();
                    res.put("author",(String) pubs.get("author"));

                    System.out.println(res);

                    reslist.add(res);
                }
                System.out.println(reslist);
            } else {
                System.out.println(reslist);
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return reslist;
    }

    /**
     * Query 1.5
     */
    public List<ObjectNode> getLoacationFromConfNameAndYear(String confName, int year) {
        List<ObjectNode> reslist= new ArrayList<>();
        try {

            List<SqlRow> pub = Conference.findByReference_1_5(confName,year);

            if (pub.get(0)!= null) {
                System.out.println("get value");
                int i=0;
                for (SqlRow pubs: pub) {
                    i++;
                    ObjectNode res = Json.newObject();

                    res.put("name",(String) pubs.get("name"));
                    res.put("year",(int) pubs.get("year"));
                    res.put("location",(String) pubs.get("location"));
                    res.put("x",(Double) pubs.get("x"));
                    res.put("y",(Double) pubs.get("y"));

                    System.out.println(res);
                    reslist.add(res);
                }
                System.out.println(reslist);
            } else {
                System.out.println(reslist);
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return reslist;
    }

    /**
     * Query 2.2
     */
    public List<ObjectNode> getCoauthorForProductiveAuthor(String name) {
        List<ObjectNode> reslist = new ArrayList<>();
        try {
            List<SqlRow> pub = pub_info.findCoAuthor_2_2(name);
            System.out.println(pub.get(0)!= null);

            if (pub.get(0)!= null) {
                int i=0;
                for (SqlRow pubs : pub) {
                    ObjectNode res = Json.newObject();
                    res.put("author",(String) pubs.get("author"));

                    System.out.println(res);

                    reslist.add(res);
                }
                System.out.println(reslist);
            } else {
                System.out.println(reslist);
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return reslist;
    }

}
