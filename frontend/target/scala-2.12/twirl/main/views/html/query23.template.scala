
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

object query23 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[List[String]],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(q23Metadata:List[List[String]]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <title>Query 2.3</title>
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
                <strong>Query 2.3</strong>
            </h1>
            <form action=""""),_display_(/*26.28*/routes/*26.34*/.HomeController.querySelectionHandler()),format.raw/*26.73*/("""" method="GET">
                <button id="api-search-button" class="btn col s4 offset-s4" type="submit">Return to Query Selection</button>
            </form>
        </header>

        <div class="row">
            <div class="card col s4 offset-s4 ">
                <div class="card-panel">
                    <form action=""""),_display_(/*34.36*/routes/*34.42*/.HomeController.queryTwoThreeHandler()),format.raw/*34.80*/("""" method="GET">
                        <h6><b>Query 2.3:</b>
                            <br> Given a conference name, and a range of years (between 2003-2020), mark the locations of where the conference was held in a map.</h6>
                        <div class="row">
                            <div class="input-field col s12">
                                <input id="name" name="name" type="text" class="validate">
                                <label for="name">Conference Name:</label>
                            </div>
                            <div class="input-field col s12">
                                <input id="yearFrom" name="yearFrom" type="text" class="validate">
                                <label for="yearFrom">Year From:</label>
                            </div>
                            <div class="input-field col s12">
                                <input id="yearTo" name="yearTo" type="text" class="validate">
                                <label for="yearTo">Year To:</label>
                            </div>
                        </div>

                        <div class="row">
                            <button id="api-search-button" class="btn col s4 offset-s4" type="submit">Submit</button>
                        </div>

                    </form>
                </div>
            </div>
            <table border="1">

                """),_display_(/*61.18*/for(paperMetadata <- q23Metadata) yield /*61.51*/{_display_(Seq[Any](format.raw/*61.52*/("""
                    """),format.raw/*62.21*/("""<tr>
                    """),_display_(/*63.22*/for(curpaper <- paperMetadata) yield /*63.52*/{_display_(Seq[Any](format.raw/*63.53*/("""
                        """),format.raw/*64.25*/("""<td>"""),_display_(/*64.30*/curpaper),format.raw/*64.38*/("""</td>
                    """)))}),format.raw/*65.22*/("""
                    """),format.raw/*66.21*/("""</tr>
                """)))}),format.raw/*67.18*/("""
            """),format.raw/*68.13*/("""</table>
        </div>
    </body>
"""))
      }
    }
  }

  def render(q23Metadata:List[List[String]]): play.twirl.api.HtmlFormat.Appendable = apply(q23Metadata)

  def f:((List[List[String]]) => play.twirl.api.HtmlFormat.Appendable) = (q23Metadata) => apply(q23Metadata)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-03-07T23:21:24.582
                  SOURCE: /Users/huasucaster/Downloads/CS7340-Lab2-Team1/Lab-2-frontend/app/views/query23.scala.html
                  HASH: a5e9463f03feb0e408de93b7ba607c33fd11d470
                  MATRIX: 962->1|1088->34|2521->1442|2536->1448|2596->1487|2954->1818|2969->1824|3028->1862|4462->3269|4511->3302|4550->3303|4599->3324|4652->3350|4698->3380|4737->3381|4790->3406|4822->3411|4851->3419|4909->3446|4958->3467|5012->3490|5053->3503
                  LINES: 28->1|33->2|57->26|57->26|57->26|65->34|65->34|65->34|92->61|92->61|92->61|93->62|94->63|94->63|94->63|95->64|95->64|95->64|96->65|97->66|98->67|99->68
                  -- GENERATED --
              */
          