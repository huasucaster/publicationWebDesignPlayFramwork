package models;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Model;
import com.avaje.ebean.SqlRow;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;
import java.sql.*;


@Entity
public class pub_info extends Model {
    private static final long serialVersionUID = 1L;

    @Id
    @Column
    public Long pid;

    @Column(columnDefinition = "VARCHAR (250)NOT NULL DEFAULT ''")
    public String title;

    @Column(columnDefinition = "VARCHAR(100) NOT NULL DEFAULT ''")
    public String mdate;

    @Column(columnDefinition = "VARCHAR(100)NOT NULL DEFAULT ''")
    public String author;

    @Column(columnDefinition = "VARCHAR(150)NOT NULL DEFAULT ''")
    public String author_list;

    @Column(columnDefinition = "VARCHAR(100) NOT NULL DEFAULT ''")
    public String article_key;

    @Column(columnDefinition = "VARCHAR(100) NOT NULL DEFAULT ''")
    public String editors;

    @Column(columnDefinition = "VARCHAR(50) NOT NULL DEFAULT ''")
    public String pages;

    @Column(columnDefinition = "VARCHAR(200) NOT NULL DEFAULT ''")
    public String ee;

    @Column(columnDefinition = "VARCHAR(100) NOT NULL DEFAULT ''")
    public String pub_url;

    @Column(columnDefinition = "INT DEFAULT 0000")
    public int pub_year;

    @Column(columnDefinition = "VARCHAR(100) NOT NULL DEFAULT ''")
    public String journal;

    @Column(columnDefinition = "VARCHAR(100) NOT NULL DEFAULT ''")
    public String book_title;

    @Column(columnDefinition = "INT NOT NULL DEFAULT 0")
    public int volume;

    @Column(columnDefinition = "INT NOT NULL DEFAULT 0")
    public int pub_number;

    @Column(columnDefinition = "VARCHAR(100) NOT NULL DEFAULT ''")
    public String publisher;

    @Column(columnDefinition = "VARCHAR(50) NOT NULL DEFAULT ''")
    public String isbn;

    @Column(columnDefinition = "VARCHAR(100) NOT NULL DEFAULT ''")
    public String series;

    @Column(columnDefinition = "VARCHAR(100) NOT NULL DEFAULT ''")
    public String cross_ref;


    public static Find<Long, pub_info> find = new Find<Long, pub_info>(){};

    /**
     * MySQL query that is utilized for Query 1.1, returns the metadata of Publication Title.
     * @param title
     * @return
     */
    public static List<SqlRow> findByTitle_1_1(String title) {

        try{

            List<SqlRow> query1_1 = Ebean.createSqlQuery("select * from pub_info where title like'"+replacePunctuation(title)+ "%'\n" +
                    "limit 1;")
                    .findList();
            return query1_1;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    /**
     * MySQL query that is utilized for Query 1.2, returns the metadata of all the papers published in the book.
     * @param title
     * @param volume
     * @param number
     * @return
     */
    public static List<SqlRow> findByJournal_1_2(String title, int volume, int number) {
        try{

            List<SqlRow> query1_2 = Ebean.createSqlQuery("Select distinct(title), author_list, mdate," +
                    "article_key,editors,pages, author_list,ee,pub_url,pub_year,journal,volume,pub_number" +
                    " from pub_info where " +
                    "journal='" + replacePunctuation(title) + "' \n" +
                    "and volume=" + volume + " \n" +
                    "and  pub_number=" + number + "")
                    .findList();
            return query1_2;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }


    /**
     * MySQL query that is utilized for Query 1.3, returns the titles of the articles published by a researcher
     * in a specific year.
     *
     * @param author
     * @param year
     * @return
     */
    public static List<SqlRow> findByTitle_1_3(String author, int year) {
        try{

            List<SqlRow> query1_3 = Ebean.createSqlQuery("SELECT distinct(title) FROM pub_info " +
                    "where author = '" + replacePunctuation(author) + "'" +
                    "and pub_year= " + year + "")
                    .findList();
            return query1_3;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Utilized to make the respective MySQL query for query 1.4.
     *
     * @return
     */
    public static List<SqlRow> findByAuthor_1_4() {
        try{
            List<SqlRow> query1_4 = Ebean.createSqlQuery("SELECT author,count(author) FROM pub_info " +
                    "where author in (SELECT author FROM pub_info  GROUP BY author HAVING COUNT(author)>10) " +
                    "group by author " +
                    "order by count(author)")
                    .findList();
            return query1_4;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    /**
     * MySQL query that is utilized for Query 2.2.
     * @param name
     * @return
     */
    public static List<SqlRow> findCoAuthor_2_2(String name) {
        try{
            List<SqlRow> query2_2 = Ebean.createSqlQuery("SELECT distinct(author) FROM pub_info " +
                    "where title in (select title from pub_info where " +
                    "author= '" + replacePunctuation(name) + "')"+
                    "and author not like '" + replacePunctuation(name) + "'")
                    .findList();
            return query2_2;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Find all publication and provide them in list.
     *
     * @return
     */
    public static List<pub_info> findAll() {
        return find.all();
    }

    /**
     * Replaces punctuation in string.
     *
     * @param str
     * @return
     */
    public static String replacePunctuation(String str) {
        if(str==null){
            return str;
        }
        String returnStr = "";
        if(str.indexOf("'") != -1) {
            returnStr = str.replaceAll("'", "''");
            str = returnStr;
        }
        return str;
    }

}
