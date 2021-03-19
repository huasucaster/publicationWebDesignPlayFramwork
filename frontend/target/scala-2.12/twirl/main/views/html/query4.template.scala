
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object query4 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(q4Auth:List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <title>Query 1.4</title>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

            <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <link rel="shortcut icon" type="image/x-icon" href="docs/images/favicon.ico" />
        <link rel="stylesheet" href="https://unpkg.com/leaflet@1.5.1/dist/leaflet.css" integrity="sha512-xwE/Az9zrjBIphAcBb3F6JVqxf46+CDLwfLMHloNu6KEQCAWi6HcDUbeOfBIptF7tcCzusKFjFw2yuvEpDL9wQ==" crossorigin=""/>
        <script src="https://unpkg.com/leaflet@1.5.1/dist/leaflet.js" integrity="sha512-GffPMF3RvMeYyc1LWMHtK8EbPv0iNZ8/oTtHPx9/cc2ILxQ+u905qIwdpULaqDkyBKgOaB57QTMg7ztg8Jm2Og==" crossorigin=""></script>
    </head>

    <body>

        <header class="topbar">
            <h1 class="focused" style="font-size: 37px;
                color: #57a957">
                <strong>Query 1.4</strong>
            </h1>
            <form action=""""),_display_(/*26.28*/routes/*26.34*/.HomeController.querySelectionHandler()),format.raw/*26.73*/("""" method="GET">
                <button id="api-search-button" class="btn col s4 offset-s4" type="submit">Return to Query Selection</button>
            </form>
        </header>

        <div class="row">
            <div class="card col s4 offset-s4 ">
                <div class="card-panel">
                    <form action=""""),_display_(/*34.36*/routes/*34.42*/.HomeController.queryFourHandler()),format.raw/*34.76*/("""" method="GET">
                        <h6> <b>Query 1.4:</b>
                            <br>Display all the authors who have published more than 10 papers in the area of SOSE to date.
                        </h6>
                        <div class="row">
                            <button id="api-search-button" class="btn col s4 offset-s4" type="submit">Submit</button>
                        </div>
                        <table border="1">
                            <tr>
                                <th>Author Name</th>
                            </tr>

                        """),_display_(/*46.26*/for(authorName <- q4Auth) yield /*46.51*/{_display_(Seq[Any](format.raw/*46.52*/("""
                            """),format.raw/*47.29*/("""<tr>
                                <td>"""),_display_(/*48.38*/authorName),format.raw/*48.48*/("""</td>
                            </tr>

                        """)))}),format.raw/*51.26*/("""
                        """),format.raw/*52.25*/("""</table>


                    </form>
                </div>
            </div>
        </div>
    </body>
</html>"""))
      }
    }
  }

  def render(q4Auth:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(q4Auth)

  def f:((List[String]) => play.twirl.api.HtmlFormat.Appendable) = (q4Auth) => apply(q4Auth)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-03-07T23:21:24.509
                  SOURCE: /Users/huasucaster/Downloads/CS7340-Lab2-Team1/Lab-2-frontend/app/views/query4.scala.html
                  HASH: 9d3e998949a36f27feda9581913ae4dd097525a8
                  MATRIX: 955->1|1070->23|2503->1431|2518->1437|2578->1476|2936->1807|2951->1813|3006->1847|3630->2444|3671->2469|3710->2470|3767->2499|3836->2541|3867->2551|3964->2617|4017->2642
                  LINES: 28->1|33->2|57->26|57->26|57->26|65->34|65->34|65->34|77->46|77->46|77->46|78->47|79->48|79->48|82->51|83->52
                  -- GENERATED --
              */
          