
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

object query22 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[List[String]],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(q22Metadata:List[List[String]]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <title>Query 2.2</title>
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
                <strong>Query 2.2</strong>
            </h1>
            <form action=""""),_display_(/*26.28*/routes/*26.34*/.HomeController.querySelectionHandler()),format.raw/*26.73*/("""" method="GET">
                <button id="api-search-button" class="btn col s4 offset-s4" type="submit">Return to Query Selection</button>
            </form>
        </header>

        <div class="row">
            <div class="card col s4 offset-s4 ">
                <div class="card-panel">
                    <form action=""""),_display_(/*34.36*/routes/*34.42*/.HomeController.queryTwoTwoHandler()),format.raw/*34.78*/("""" method="GET">
                        <h6> <b>Query 2.2</b>
                            <br>For the productive authors (e.g., published more than 10 papers) in the area of SOSE, list all of their co-authors.
                        </h6>
                        <div class="row">
                            <button id="api-search-button" class="btn col s4 offset-s4" type="submit">Submit</button>
                        </div>
                        <table border="1">
                            <tr>
                                <th>Author List</th>
                                <th>Co-Author List</th>
                            </tr>
                            """),_display_(/*46.30*/for(paperMetadata <- q22Metadata) yield /*46.63*/{_display_(Seq[Any](format.raw/*46.64*/("""
                                """),format.raw/*47.33*/("""<tr>
                                """),_display_(/*48.34*/for(curpaper <- paperMetadata) yield /*48.64*/{_display_(Seq[Any](format.raw/*48.65*/("""
                                    """),format.raw/*49.37*/("""<td>"""),_display_(/*49.42*/curpaper),format.raw/*49.50*/("""</td>
                                """)))}),format.raw/*50.34*/("""
                                """),format.raw/*51.33*/("""</tr>
                            """)))}),format.raw/*52.30*/("""
                        """),format.raw/*53.25*/("""</table>

                    </form>
                </div>
            </div>




        </div>
    </body>
</html>"""))
      }
    }
  }

  def render(q22Metadata:List[List[String]]): play.twirl.api.HtmlFormat.Appendable = apply(q22Metadata)

  def f:((List[List[String]]) => play.twirl.api.HtmlFormat.Appendable) = (q22Metadata) => apply(q22Metadata)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-03-07T23:21:24.641
                  SOURCE: /Users/huasucaster/Downloads/CS7340-Lab2-Team1/Lab-2-frontend/app/views/query22.scala.html
                  HASH: 5a4065968d2e9f5f4528533a121c01155e7eb7dd
                  MATRIX: 962->1|1088->34|2521->1442|2536->1448|2596->1487|2954->1818|2969->1824|3026->1860|3732->2539|3781->2572|3820->2573|3881->2606|3946->2644|3992->2674|4031->2675|4096->2712|4128->2717|4157->2725|4227->2764|4288->2797|4354->2832|4407->2857
                  LINES: 28->1|33->2|57->26|57->26|57->26|65->34|65->34|65->34|77->46|77->46|77->46|78->47|79->48|79->48|79->48|80->49|80->49|80->49|81->50|82->51|83->52|84->53
                  -- GENERATED --
              */
          