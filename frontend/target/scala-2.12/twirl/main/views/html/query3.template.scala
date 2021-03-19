
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

object query3 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[List[String]],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(q3Metadata:List[List[String]]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <title>Query 1.3</title>
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
                <strong>Query 1.3</strong>
            </h1>
            <form action=""""),_display_(/*26.28*/routes/*26.34*/.HomeController.querySelectionHandler()),format.raw/*26.73*/("""" method="GET">
                <button id="api-search-button" class="btn col s4 offset-s4" type="submit">Return to Query Selection</button>
            </form>
        </header>

        <div class="row">
            <div class="card col s4 offset-s4 ">
                <div class="card-panel">
                    <form action=""""),_display_(/*34.36*/routes/*34.42*/.HomeController.queryThreeHandler()),format.raw/*34.77*/("""" method="GET">
                        <h6> <b>Query 1.3</b>
                            <br>Display the titles of the articles published by a researcher in a specific year.
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
                </tr>
                """),_display_(/*63.18*/for(paperMetadata <- q3Metadata) yield /*63.50*/{_display_(Seq[Any](format.raw/*63.51*/("""
                """),format.raw/*64.17*/("""<tr>
                    """),_display_(/*65.22*/for(curpaper <- paperMetadata) yield /*65.52*/{_display_(Seq[Any](format.raw/*65.53*/("""
                    """),format.raw/*66.21*/("""<td>"""),_display_(/*66.26*/curpaper),format.raw/*66.34*/("""</td>
                    """)))}),format.raw/*67.22*/("""
                """),format.raw/*68.17*/("""</tr>
                """)))}),format.raw/*69.18*/("""
            """),format.raw/*70.13*/("""</table>
        </div>
    </body>
</html>"""))
      }
    }
  }

  def render(q3Metadata:List[List[String]]): play.twirl.api.HtmlFormat.Appendable = apply(q3Metadata)

  def f:((List[List[String]]) => play.twirl.api.HtmlFormat.Appendable) = (q3Metadata) => apply(q3Metadata)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-03-07T23:21:24.570
                  SOURCE: /Users/huasucaster/Downloads/CS7340-Lab2-Team1/Lab-2-frontend/app/views/query3.scala.html
                  HASH: 31dab6f0af897db0851c8b297fa379f3a768374e
                  MATRIX: 961->1|1086->33|2519->1441|2534->1447|2594->1486|2952->1817|2967->1823|3023->1858|4324->3132|4372->3164|4411->3165|4456->3182|4509->3208|4555->3238|4594->3239|4643->3260|4675->3265|4704->3273|4762->3300|4807->3317|4861->3340|4902->3353
                  LINES: 28->1|33->2|57->26|57->26|57->26|65->34|65->34|65->34|94->63|94->63|94->63|95->64|96->65|96->65|96->65|97->66|97->66|97->66|98->67|99->68|100->69|101->70
                  -- GENERATED --
              */
          