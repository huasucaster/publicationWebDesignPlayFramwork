package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.libs.concurrent.HttpExecutionContext;
import play.libs.ws.WSResponse;


import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletionStage;
/**
 * File Name: HomeController.java
 *
 * This Controller handles Http Requests and Responses
 * from the backend then stores the values into a form used to display to user.
 * 
 * @author Beichen Hu, John Reynolds, Jianyu Shen, Jiachen Tang
 * @date March 7st, 2021
 * @since 1.0
 */
public class HomeController extends Controller {

    @Inject
    HttpExecutionContext ec;

    private FormFactory formFactory;

    @Inject
    public HomeController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }

    /**
     * Index page
     */
    public Result index() {
        return ok(views.html.querySelection.render());
    }

    /**
     * Handles data and http response/request information for Query 1.1
     * @return
     */
    public CompletionStage<Result> queryOneHandler() {
        Form<Publication> publicationForm = formFactory.form(Publication.class).bindFromRequest();
        if (publicationForm.hasErrors()){
            String authorizeMessage = "Invalid publication Title";
            List<List<String>> wrongMessage = new ArrayList<>();
            wrongMessage.get(0).add(authorizeMessage);
            return (CompletionStage<Result>) badRequest(views.html.query1.render(wrongMessage));
        }

        return publicationForm.get().checkAuthorizedQ1().thenApplyAsync((WSResponse r) -> {
            System.out.println("Body: "+ r.getBody());
            if (r.getStatus() == 200 && r.asJson() != null && !r.getBody().equals("false")) {
                JsonNode res = r.asJson();
                // add Title to session
                session("title", publicationForm.get().getTitle());
                List<List<String>> res1 = new ArrayList<>();
                String query1 = "";
                for (int i = 0; i < res.size(); i++) {
                    JsonNode row = res.get(i);
                    List<String> curNode = new ArrayList<>();
                    curNode.add(""+row.findValue("title"));
                    curNode.add(""+row.findValue("mdate"));
                    curNode.add(""+row.findValue("author_list"));
                    curNode.add(""+row.findValue("article_key"));
                    curNode.add(""+row.findValue("editors"));
                    curNode.add(""+row.findValue("pages"));
                    curNode.add(""+row.findValue("ee"));
                    curNode.add(""+row.findValue("pub_url"));
                    curNode.add(""+row.findValue("pub_year"));
                    curNode.add(""+row.findValue("journal"));
                    curNode.add(""+row.findValue("book_title"));
                    curNode.add(""+row.findValue("volume"));
                    curNode.add(""+row.findValue("pub_number"));
                    curNode.add(""+row.findValue("publisher"));
                    curNode.add(""+row.findValue("isbn"));
                    curNode.add(""+row.findValue("series"));
                    curNode.add(""+row.findValue("cross_ref"));

                    query1 = "The publication you are looking for: \n" +
                            "Title: " + row.findValue("title") + "\n" +
                            "Mdate: " + row.findValue("mdate") + "\n" +
                            "Author list: " + row.findValue("author_list") + "\n" +
                            "Article key: " + row.findValue("article_key") + "\n" +
                            "Editors: " + row.findValue("editors") + "\n" +
                            "Pages: " + row.findValue("pages") + "\n" +
                            "ee: " + row.findValue("ee") + "\n" +
                            "Pub_url: " + row.findValue("pub_url") + "\n" +
                            "Pub_year: " + row.findValue("pub_year") + "\n" +
                            "Journal: " + row.findValue("journal") + "\n" +
                            "Book_title(Conference_name): " + row.findValue("book_title") + "\n" +
                            "Volume: " + row.findValue("volume") + "\n" +
                            "Pub_number: " + row.findValue("pub_number") + "\n" +
                            "Publisher: " + row.findValue("publisher") + "\n" +
                            "ISBN: " + row.findValue("isbn") + "\n" +
                            "Series: " + row.findValue("series") + "\n" +
                            "Cross_ref: " + row.findValue("cross_ref") + "\n";
                    res1.add(curNode);
                    System.out.println(query1);
                }
                return ok(views.html.query1.render(res1));


            } else {
                System.out.println("response null");
                String authorizeMessage = "Invalid publication Title";
                List<List<String>> wrongMessage = new ArrayList<>();
                List<String> curWrong = new ArrayList<>();
                curWrong.add(authorizeMessage);
                wrongMessage.add(curWrong);

                return badRequest(views.html.query1.render(wrongMessage));
            }
        }, ec.current());
    }

    /**
     * Handles data and http response/request information for Query 1.2
     * @return
     */
    public CompletionStage<Result> queryTwoHandler() {
        Form<Publication> publicationForm = formFactory.form(Publication.class).bindFromRequest();
        if (publicationForm.hasErrors()){
            String authorizeMessage = "Form has errors";
            List<List<String>> wrongMessage = new ArrayList<>();
            List<String> curMess = new ArrayList<>();
            curMess.add(authorizeMessage);
            wrongMessage.add(curMess);
            return (CompletionStage<Result>) badRequest(views.html.query2.render(wrongMessage));
        }

        return publicationForm.get().checkAuthorizedQ2().thenApplyAsync((WSResponse r) -> {
            if (r.getStatus() == 200 && r.asJson() != null && !r.getBody().equals("null")) {
                JsonNode res = r.asJson();
                // add journal, volume, and pub_number to session
                session("journal", publicationForm.get().getJournal());
                session("volume",publicationForm.get().getVolume());
                session("pub_number", publicationForm.get().getPub_number());

                String query2 = "";
                System.out.println("The metadata of journal you are looking for:");
                List<List<String>> res2 = new ArrayList<>();
                for (int i = 0; i < res.size(); i++) {
                    List<String> curList = new ArrayList<>();
                    JsonNode row = res.get(i);
                    curList.add(""+row.findValue("title"));
                    curList.add(""+row.findValue("mdate"));
                    curList.add(""+row.findValue("author_list"));
                    curList.add(""+row.findValue("article_key"));
                    curList.add(""+row.findValue("editors"));
                    curList.add(""+row.findValue("pages"));
                    curList.add(""+row.findValue("ee"));
                    curList.add(""+row.findValue("pub_url"));
                    curList.add(""+row.findValue("pub_year"));
                    curList.add(""+row.findValue("journal"));
                    curList.add(""+row.findValue("volume"));
                    curList.add(""+row.findValue("pub_number"));
                    curList.add(""+row.findValue("publisher"));

                    query2 += "Title: " + row.findValue("title") + "\n" +
                            "Mdate: " + row.findValue("mdate") + "\n" +
                            "Author list: " + row.findValue("author_list") + "\n" +
                            "Article key: " + row.findValue("article_key") + "\n" +
                            "Editors: " + row.findValue("editors") + "\n" +
                            "Pages: " + row.findValue("pages") + "\n" +
                            "ee: " + row.findValue("ee") + "\n" +
                            "Pub_url: " + row.findValue("pub_url") + "\n" +
                            "Pub_year: " + row.findValue("pub_year") + "\n" +
                            "Journal: " + row.findValue("journal") + "\n" +
                            "Volume: " + row.findValue("volume") + "\n" +
                            "Pub_number: " + row.findValue("pub_number") + "\n" +
                            "Publisher: " + row.findValue("publisher") + "\n";
                    res2.add(curList);
                    System.out.println(query2);
                }
                return ok(views.html.query2.render(res2));


            } else {
                System.out.println("response null");
                String authorizeMessage = "Invalid input";
                List<List<String>> wrongMessage = new ArrayList<>();
                List<String> curWrong = new ArrayList<>();
                curWrong.add(authorizeMessage);
                wrongMessage.add(curWrong);
                return badRequest(views.html.query2.render(wrongMessage));
            }
        }, ec.current());
    }

    /**
     * Handles data and http response/request information for Query 1.3
     * @return
     */
    public CompletionStage<Result> queryThreeHandler() {
        Form<Publication> publicationForm = formFactory.form(Publication.class).bindFromRequest();
        if (publicationForm.hasErrors()){
            String authorizeMessage = "Form has errors";
            List<List<String>> wrongMessage = new ArrayList<>();
            List<String> curMess = new ArrayList<>();
            curMess.add(authorizeMessage);
            wrongMessage.add(curMess);
            return (CompletionStage<Result>) badRequest(views.html.query3.render(wrongMessage));
        }

        return publicationForm.get().checkAuthorizedQ3().thenApplyAsync((WSResponse r) -> {
            if (r.getStatus() == 200 && r.asJson() != null && !r.getBody().equals("null")) {
                JsonNode res = r.asJson();
                // add author and pub_year to session
                session("author", publicationForm.get().getAuthor());
                session("pub_year", publicationForm.get().getPub_year());
                List<List<String>> res3 = new ArrayList<>();
                System.out.println("The publication you are looking for:");
                String query3 = "";
                for (int i = 0; i < res.size(); i++) {
                    JsonNode row = res.get(i);
                    List<String> curList = new ArrayList<>();
                    curList.add(""+row.findValue("title"));
                    query3 += "The publication you are looking for: \n" +
                            "Title: " + row.findValue("title") + "\n";
                    System.out.println(query3);
                    res3.add(curList);
                }
                return ok(views.html.query3.render(res3));
            } else {
                System.out.println("response null");
                String authorizeMessage = "Invalid input";
                List<List<String>> wrongMessage = new ArrayList<>();
                List<String> curWrong = new ArrayList<>();
                curWrong.add(authorizeMessage);
                wrongMessage.add(curWrong);
                return badRequest(views.html.query3.render(wrongMessage));
            }
        }, ec.current());
    }

    /**
     * Handles data and http response/request information for Query 1.4
     * @return
     */
    public CompletionStage<Result> queryFourHandler() {
        Form<Publication> publicationForm = formFactory.form(Publication.class).bindFromRequest();
        if (publicationForm.hasErrors()){
            List<String> wrongList = new ArrayList<>();
            wrongList.add("Author form has errors");
            return (CompletionStage<Result>) badRequest(views.html.query4.render(wrongList));  // send parameter like register so that user could know
        }

        return publicationForm.get().checkAuthorizedQ4().thenApplyAsync((WSResponse r) -> {
            if (r.getStatus() == 200 && r.asJson() != null && !r.getBody().equals("null")) {
                JsonNode res = r.asJson();
                // add author to session
                session("Author", publicationForm.get().getAuthor());
                String query4 = "";
                System.out.println("The author you are looking for: ");
                List<String> resA = new ArrayList<String>();
                for (int i = 0; i < res.size(); i++) {
                    JsonNode row = res.get(i);
                    query4 += "Author: " + row.findValue("author") + "\n";
                    resA.add(""+row.findValue("author"));
                    System.out.println(query4);
                }
                return ok(views.html.query4.render(resA));

            } else {
                System.out.println("response null");
                String authorizeMessage = "Invalid publication Title";
                List<String> wrongError = new ArrayList<>();
                wrongError.add(authorizeMessage);
                return badRequest(views.html.query4.render(wrongError));
            }
        }, ec.current());
    }

    /**
     * Handles data and http response/request information for Query 1.5
     * @return
     */
    public CompletionStage<Result> queryFiveHandler() {
        Form<Conference> publicationForm = formFactory.form(Conference.class).bindFromRequest();
        if (publicationForm.hasErrors()){

            return (CompletionStage<Result>) badRequest(views.html.query5.render(new ArrayList<Conference>()));

        }

        return publicationForm.get().checkAuthorizedQ5().thenApplyAsync((WSResponse r) -> {
            System.out.println(r.getStatus());
            if (r.getStatus() == 200 && r.asJson() != null && !r.getBody().equals("null")) {
                JsonNode res = r.asJson();
                String query4 = "";
                System.out.println("The conference you are looking for: ");
                List<Conference> resQ5 = new ArrayList<Conference>();
                System.out.println("size"+res.size());
                for (int i = 0; i < res.size(); i++) {
                    JsonNode row = res.get(i);
                    System.out.println(row);
                    System.out.println(row.findValue("name").asText());
                    System.out.println(row.findValue("year").asInt());
                    System.out.println(row.findValue("location").asText());
                    System.out.println(row.findValue("x").asDouble());
                    System.out.println(row.findValue("y").asDouble());
                    Conference curConference = new Conference();
                    curConference.setName(row.findValue("name").asText());
                    curConference.setYear(row.findValue("year").asText());
                    curConference.setLocation(row.findValue("location").asText());
                    curConference.setX(row.findValue("x").asDouble());
                    curConference.setY(row.findValue("y").asDouble());
                    resQ5.add(curConference);
                    System.out.println("curConf: "+curConference);
                }

                return ok(views.html.query5.render(resQ5));

            } else {

                return badRequest(views.html.query5.render(new ArrayList<Conference>()));
            }
        }, ec.current());
    }

    /**
     * Handles data and http response/request information for Query 2.1
     * @return
     */
    public CompletionStage<Result> queryTwoOneHandler() {
        Form<Publication> publicationForm = formFactory.form(Publication.class).bindFromRequest();
        if (publicationForm.hasErrors()){
            String authorizeMessage = "Form has errors";
            List<List<String>> wrongMessage = new ArrayList<>();
            List<String> curMess = new ArrayList<>();
            curMess.add(authorizeMessage);
            wrongMessage.add(curMess);
            return (CompletionStage<Result>) badRequest(views.html.query21.render(wrongMessage));
        }

        return publicationForm.get().checkAuthorizedQ21().thenApplyAsync((WSResponse r) -> {
            if (r.getStatus() == 200 && r.asJson() != null && !r.getBody().equals("null")) {
                JsonNode res = r.asJson();
                List<List<String>> res2_1 = new ArrayList<>();
                // add author and pub_year to session
                session("author", publicationForm.get().getAuthor());
                session("pub_year", publicationForm.get().getPub_year());
                System.out.println(res);
                for (int i = 0; i < res.size(); i++) {
                    JsonNode row = res.get(i);
                    List<String> curNode = new ArrayList<>();
                    curNode.add(""+row.findValue("title"));
                    curNode.add(""+row.findValue("mdate"));
                    curNode.add(""+row.findValue("author_list"));
                    curNode.add(""+row.findValue("article_key"));
                    curNode.add(""+row.findValue("editors"));
                    curNode.add(""+row.findValue("pages"));
                    curNode.add(""+row.findValue("ee"));
                    curNode.add(""+row.findValue("pub_url"));
                    curNode.add(""+row.findValue("pub_year"));
                    curNode.add(""+row.findValue("journal"));
                    curNode.add(""+row.findValue("book_title"));
                    curNode.add(""+row.findValue("volume"));
                    curNode.add(""+row.findValue("pub_number"));
                    curNode.add(""+row.findValue("publisher"));
                    curNode.add(""+row.findValue("isbn"));
                    curNode.add(""+row.findValue("series"));
                    curNode.add(""+row.findValue("cross_ref"));
                    res2_1.add(curNode);
                }

                System.out.println(res2_1);
                return ok(views.html.query21.render(res2_1));

            } else {
                System.out.println("response null");
                String authorizeMessage = "Invalid input";
                List<List<String>> wrongMessage = new ArrayList<>();
                List<String> curWrong = new ArrayList<>();
                curWrong.add(authorizeMessage);
                wrongMessage.add(curWrong);
                return badRequest(views.html.query21.render(wrongMessage));
            }
        }, ec.current());
    }

    /**
     * Handles data and http response/request information for Query 2.2
     * @return
     */
    public CompletionStage<Result> queryTwoTwoHandler() {
        Form<Publication> publicationForm = formFactory.form(Publication.class).bindFromRequest();
        if (publicationForm.hasErrors()) {
            List<List<String>> wrongList = new ArrayList<>();
            wrongList.get(0).add("Author form has errors");
            return (CompletionStage<Result>) badRequest(views.html.query22.render(wrongList));
        }

        return publicationForm.get().checkAuthorizedQ22().thenApplyAsync((WSResponse r) -> {
            if (r.getStatus() == 200 && r.asJson() != null && !r.getBody().equals("null")) {
                JsonNode res = r.asJson();
                // add author to session
                session("Author", publicationForm.get().getAuthor());
                List<List<String>> res2_2 = new ArrayList<>();
                System.out.println("The co_author you are looking for: ");
                for (int i = 0; i < res.size(); i++) {
                    JsonNode row = res.get(i);
                    List<String> curNode = new ArrayList<>();
                    curNode.add(""+row.findValue("author"));
                    curNode.add(""+row.findValue("coauthor"));
                    res2_2.add(curNode);
                }
                System.out.println(res2_2);
                return ok(views.html.query22.render(res2_2));
            } else {
                System.out.println("response null");
                String authorizeMessage = "No response";
                List<List<String>> wrongMessage = new ArrayList<>();
                List<String> curWrong = new ArrayList<>();
                curWrong.add(authorizeMessage);
                wrongMessage.add(curWrong);

                return badRequest(views.html.query1.render(wrongMessage));
            }
        }, ec.current());
    }

    /**
     * Handles data and http response/request information for Query 2.3
     * @return
     */
    public CompletionStage<Result> queryTwoThreeHandler(){
        Form<Conference> publicationForm = formFactory.form(Conference.class).bindFromRequest();
        if (publicationForm.hasErrors()){
            String authorizeMessage = "Form has errors";
            List<List<String>> wrongMessage = new ArrayList<>();
            List<String> curMess = new ArrayList<>();
            curMess.add(authorizeMessage);
            wrongMessage.add(curMess);
            return (CompletionStage<Result>) badRequest(views.html.query23.render(wrongMessage));
        }

        return publicationForm.get().checkAuthorizedQ23().thenApplyAsync((WSResponse r) -> {
            if (r.getStatus() == 200 && r.asJson() != null && !r.getBody().equals("null")) {
                JsonNode res = r.asJson();
                session("name", publicationForm.get().getName());
                session("yearFrom", publicationForm.get().getYear());
                session("yearTo", publicationForm.get().getYear());

                System.out.println("The metadata of conference you are looking for:");
                List<Conference> confList = new ArrayList<>();
                for (int i = 0; i < res.size(); i++) {
                    Conference curConf = new Conference();
                    JsonNode row = res.get(i);
                    curConf.setName(row.get("name").asText());
                    curConf.setYear(row.get("year").asText());
                    curConf.setLocation(row.get("location").asText());
                    curConf.setX(row.get("x").asDouble());
                    curConf.setY(row.get("y").asDouble());
                    confList.add(curConf);
                }
                return ok(views.html.response.render(confList));

            } else {
                System.out.println("response null");
                String authorizeMessage = "Invalid input";
                List<List<String>> wrongMessage = new ArrayList<>();
                List<String> curWrong = new ArrayList<>();
                curWrong.add(authorizeMessage);
                wrongMessage.add(curWrong);
                return badRequest(views.html.query2.render(wrongMessage));
            }
        }, ec.current());

    }

    /**
     * handle querySelection
     */
    public Result querySelectionHandler() {
        return ok(views.html.querySelection.render());
    }

    /**
     * Query page
     */
    public Result query1() {
        return ok(views.html.query1.render(new ArrayList<>()));
    }
    public Result query2() {
        return ok(views.html.query2.render(new ArrayList<>()));
    }
    public Result query3() {
        return ok(views.html.query3.render(new ArrayList<>()));
    }

    public Result query4() {
        return ok(views.html.query4.render(new ArrayList<>()));
    }

    public Result query5() {
        return ok(views.html.query5.render(new ArrayList<>()));
    }

    public Result query21() {
        return ok(views.html.query21.render(new ArrayList<>()));
    }

    public Result query22() {
        return ok(views.html.query22.render(new ArrayList<>()));
    }

    public Result query23() {
        return ok(views.html.query23.render(new ArrayList<>()));
    }

}