
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

object query5 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Conference],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(conferences: List[Conference]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <title>Query 1.5</title>
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
                <strong>Query 1.5</strong>
            </h1>
            <form action=""""),_display_(/*26.28*/routes/*26.34*/.HomeController.querySelectionHandler()),format.raw/*26.73*/("""" method="GET">
                <button id="api-search-button" class="btn col s4 offset-s4" type="submit">Return to Query Selection</button>
            </form>
        </header>

        <div class="row">
            <div class="card col s4 offset-s4 ">
                <div class="card-panel">
                    <form action=""""),_display_(/*34.36*/routes/*34.42*/.HomeController.queryFiveHandler()),format.raw/*34.76*/("""" method="GET">
                        <h6> <b>Query 1.5:</b>
                            <br>Given a conference and a year, display the location where it was held.
                        </h6>
                        <div class="row">
                            <div class="input-field col s12">
                                <input id="name" name="name" type="text" class="validate">
                                <label for="name">Conference:</label>
                            </div>
                            <div class="input-field col s12">
                                <input id="year" name="year" type="text" class="validate">
                                <label for="year">Year:</label>
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
                    <th>Conference</th>
                    <th>Year</th>
                    <th>Location</th>
                    <th>x-axis</th>
                    <th>y-axis</th>
                </tr>
                """),_display_(/*64.18*/if(conferences!=null)/*64.39*/{_display_(Seq[Any](format.raw/*64.40*/("""
                    """),_display_(/*65.22*/for(conference <- conferences) yield /*65.52*/{_display_(Seq[Any](format.raw/*65.53*/("""
                        """),format.raw/*66.25*/("""<tr>
                            <td>"""),_display_(/*67.34*/conference/*67.44*/.getName()),format.raw/*67.54*/("""</td>
                            <td>"""),_display_(/*68.34*/conference/*68.44*/.getYear()),format.raw/*68.54*/("""</td>
                            <td>"""),_display_(/*69.34*/conference/*69.44*/.getLocation()),format.raw/*69.58*/("""</td>
                            <td>"""),_display_(/*70.34*/conference/*70.44*/.getX()),format.raw/*70.51*/("""</td>
                            <td>"""),_display_(/*71.34*/conference/*71.44*/.getY()),format.raw/*71.51*/("""</td>
                        </tr>
                    """)))}),format.raw/*73.22*/("""
                """)))}),format.raw/*74.18*/("""

            """),format.raw/*76.13*/("""</table>

        </div>
    </body>
"""))
      }
    }
  }

  def render(conferences:List[Conference]): play.twirl.api.HtmlFormat.Appendable = apply(conferences)

  def f:((List[Conference]) => play.twirl.api.HtmlFormat.Appendable) = (conferences) => apply(conferences)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-03-07T23:21:24.619
                  SOURCE: /Users/huasucaster/Downloads/CS7340-Lab2-Team1/Lab-2-frontend/app/views/query5.scala.html
                  HASH: c12724e3c7955c00330912409c8c6e31cea69902
                  MATRIX: 959->1|1084->33|2517->1441|2532->1447|2592->1486|2950->1817|2965->1823|3020->1857|4364->3174|4394->3195|4433->3196|4482->3218|4528->3248|4567->3249|4620->3274|4685->3312|4704->3322|4735->3332|4801->3371|4820->3381|4851->3391|4917->3430|4936->3440|4971->3454|5037->3493|5056->3503|5084->3510|5150->3549|5169->3559|5197->3566|5285->3623|5334->3641|5376->3655
                  LINES: 28->1|33->2|57->26|57->26|57->26|65->34|65->34|65->34|95->64|95->64|95->64|96->65|96->65|96->65|97->66|98->67|98->67|98->67|99->68|99->68|99->68|100->69|100->69|100->69|101->70|101->70|101->70|102->71|102->71|102->71|104->73|105->74|107->76
                  -- GENERATED --
              */
          