
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

object querySelection extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <title>DBLP Query Options</title>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

            <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <link rel="shortcut icon" type="image/x-icon" href="docs/images/favicon.ico" />
        <link rel="stylesheet" href="https://unpkg.com/leaflet@1.5.1/dist/leaflet.css" integrity="sha512-xwE/Az9zrjBIphAcBb3F6JVqxf46+CDLwfLMHloNu6KEQCAWi6HcDUbeOfBIptF7tcCzusKFjFw2yuvEpDL9wQ==" crossorigin=""/>
        <script src="https://unpkg.com/leaflet@1.5.1/dist/leaflet.js" integrity="sha512-GffPMF3RvMeYyc1LWMHtK8EbPv0iNZ8/oTtHPx9/cc2ILxQ+u905qIwdpULaqDkyBKgOaB57QTMg7ztg8Jm2Og==" crossorigin=""></script>
    </head>

    <header class="topbar">
        <h1 class="focused" style="font-size: 37px;
                color: #57a957">
            <strong>DBLP Query Options</strong>
            <h4> Select a Query: </h4>
        </h1>
    </header>
    <body>
        <h6> <b>Query 1.1:</b>
            <br>Given a paper name (i.e., title), list its publication metadata.
        </h6>
            <form action=""""),_display_(/*29.28*/routes/*29.34*/.HomeController.query1()),format.raw/*29.58*/("""">
                <div class="row">
                    <button id="select-query-1" class="btn" type="select">Select</button>
                </div>
            </form>
            <h6><b>Query 1.2:</b>
            <br>Given a journal name and a year (volume) and an issue (number),
            <br>find out the metadata of all the papers published in the book
            <br>(means the volume+number of the journal).
            </h6>
            <form action=""""),_display_(/*39.28*/routes/*39.34*/.HomeController.query2()),format.raw/*39.58*/("""">
                <div class="row">
                    <button id="select-query-2" class="btn" type="select">Select</button>
                </div>
            </form>
        <h6> <b>Query 1.3</b>
            <br>Display the titles of the articles published by a researcher in a specific year.
        </h6>
            <form action=""""),_display_(/*47.28*/routes/*47.34*/.HomeController.query3()),format.raw/*47.58*/("""">
                <div class="row">
                    <button id="select-query-3" class="btn" type="select">Select</button>
                </div>
            </form>
        <h6> <b>Query 1.4:</b>
            <br>Display all the authors who have published more than 10 papers in the area of SOSE to date.
        </h6>
            <form action=""""),_display_(/*55.28*/routes/*55.34*/.HomeController.query4()),format.raw/*55.58*/("""">
                <div class="row">
                    <button id="select-query-4" class="btn" type="select">Select</button>
                </div>
            </form>
        <h6> <b>Query 1.5:</b>
            <br>Given a conference and a year, display the location where it was held.
        </h6>
        <form action=""""),_display_(/*63.24*/routes/*63.30*/.HomeController.query5()),format.raw/*63.54*/("""">
            <div class="row">
                <button id="select-query-4" class="btn" type="select">Select</button>
            </div>
        </form>
        <h6> <b>Query 2.1:</b>
            <br>Given a researcher's name and a year, list all published articles' metadata.
        </h6>
        <form action=""""),_display_(/*71.24*/routes/*71.30*/.HomeController.query21()),format.raw/*71.55*/("""">
            <div class="row">
                <button id="select-query-4" class="btn" type="select">Select</button>
            </div>
        </form>
        <h6> <b>Query 2.2:</b>
            <br>For the productive authors (e.g., published more than 10 papers) in the area of SOSE, list all of their co-authors.
        </h6>
        <form action=""""),_display_(/*79.24*/routes/*79.30*/.HomeController.query22()),format.raw/*79.55*/("""">
            <div class="row">
                <button id="select-query-4" class="btn" type="select">Select</button>
            </div>
        </form>
        <h6> <b>Query 2.3:</b>
            <br>Given a conference name, and a range of years (between 2003-2020), mark the locations of where the conference was held in a map.

        </h6>
        <form action=""""),_display_(/*88.24*/routes/*88.30*/.HomeController.query23()),format.raw/*88.55*/("""">
            <div class="row">
                <button id="select-query-4" class="btn" type="select">Select</button>
            </div>
        </form>
    </body>
</html>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-03-07T23:21:24.559
                  SOURCE: /Users/huasucaster/Downloads/CS7340-Lab2-Team1/Lab-2-frontend/app/views/querySelection.scala.html
                  HASH: 4234a28c2caae85a8aa58bbc3e8c63638a0a93a9
                  MATRIX: 1039->0|2652->1588|2667->1594|2712->1618|3204->2083|3219->2089|3264->2113|3629->2451|3644->2457|3689->2481|4066->2831|4081->2837|4126->2861|4478->3186|4493->3192|4538->3216|4880->3531|4895->3537|4941->3562|5322->3916|5337->3922|5383->3947|5778->4315|5793->4321|5839->4346
                  LINES: 33->1|61->29|61->29|61->29|71->39|71->39|71->39|79->47|79->47|79->47|87->55|87->55|87->55|95->63|95->63|95->63|103->71|103->71|103->71|111->79|111->79|111->79|120->88|120->88|120->88
                  -- GENERATED --
              */
          