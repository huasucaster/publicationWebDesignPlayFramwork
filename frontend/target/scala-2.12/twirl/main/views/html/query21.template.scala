
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

object query21 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[List[String]],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(q21Metadata:List[List[String]]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <title>Query 2.1</title>
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
                <strong>Query 2.1</strong>
            </h1>
            <form action=""""),_display_(/*26.28*/routes/*26.34*/.HomeController.querySelectionHandler()),format.raw/*26.73*/("""" method="GET">
                <button id="api-search-button" class="btn col s4 offset-s4" type="submit">Return to Query Selection</button>
            </form>
        </header>

        <div class="row">
            <div class="card col s4 offset-s4 ">
                <div class="card-panel">
                    <form action=""""),_display_(/*34.36*/routes/*34.42*/.HomeController.queryTwoOneHandler()),format.raw/*34.78*/("""" method="GET">
                        <h6> <b>Query 2.1</b>
                            <br>Given a researcher's name and a year, list all published articles' metadata.
                        </h6>
                        <div class="row">
                            <div class="input-field col s12">
                                <input id="author" name="author" type="text" class="validate">
                                <label for="author">Researcher name:</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input id="pub_year" name="pub_year" type="text" class="validate">
                                <label for="pub_year">Year:</label>
                            </div>
                        </div>

                        <div class="row">
                            <button id="api-search-button" class="btn col s4 offset-s4" type="submit">Submit</button>
                        </div>

                    </form>
                </div>
            </div>

            <table border="1">
                <tr>
                    <th>Title</th>
                    <th>Mdate</th>
                    <th>Author List</th>
                    <th>Article Key</th>
                    <th>Editors</th>
                    <th>Pages</th>
                    <th>EE</th>
                    <th>Pub_url</th>
                    <th>Pub_year</th>
                    <th>Journal</th>
                    <th>Book_title(Conference Name)</th>
                    <th>Volume</th>
                    <th>Pub_number</th>
                    <th>Publisher</th>
                    <th>ISBN</th>
                    <th>Series</th>
                    <th>Cross_ref</th>
                </tr>
                """),_display_(/*79.18*/for(paperMetadata <- q21Metadata) yield /*79.51*/{_display_(Seq[Any](format.raw/*79.52*/("""
                    """),format.raw/*80.21*/("""<tr>
                    """),_display_(/*81.22*/for(curpaper <- paperMetadata) yield /*81.52*/{_display_(Seq[Any](format.raw/*81.53*/("""
                        """),format.raw/*82.25*/("""<td>"""),_display_(/*82.30*/curpaper),format.raw/*82.38*/("""</td>
                    """)))}),format.raw/*83.22*/("""
                    """),format.raw/*84.21*/("""</tr>
                """)))}),format.raw/*85.18*/("""
            """),format.raw/*86.13*/("""</table>
        </div>
    </body>
</html>"""))
      }
    }
  }

  def render(q21Metadata:List[List[String]]): play.twirl.api.HtmlFormat.Appendable = apply(q21Metadata)

  def f:((List[List[String]]) => play.twirl.api.HtmlFormat.Appendable) = (q21Metadata) => apply(q21Metadata)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-03-07T23:21:24.545
                  SOURCE: /Users/huasucaster/Downloads/CS7340-Lab2-Team1/Lab-2-frontend/app/views/query21.scala.html
                  HASH: 5dcc0d4c4454697174b1e0fd3d95f3a13e3b70c8
                  MATRIX: 962->1|1088->34|2521->1442|2536->1448|2596->1487|2954->1818|2969->1824|3026->1860|4937->3744|4986->3777|5025->3778|5074->3799|5127->3825|5173->3855|5212->3856|5265->3881|5297->3886|5326->3894|5384->3921|5433->3942|5487->3965|5528->3978
                  LINES: 28->1|33->2|57->26|57->26|57->26|65->34|65->34|65->34|110->79|110->79|110->79|111->80|112->81|112->81|112->81|113->82|113->82|113->82|114->83|115->84|116->85|117->86
                  -- GENERATED --
              */
          