
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

object response extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[controllers.Conference],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(confereces:List[controllers.Conference]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!doctype html>
<html lang="en">
    <head>
        <link rel="stylesheet" href="https://unpkg.com/leaflet@1.7.1/dist/leaflet.css"
        integrity="sha512-xodZBNTC5n17Xt2atTPuE1HxjVMSvLVW9ocqUKLsCC5CXdbqCmblAshOMAS6/keqq/sMZMZ19scR4PsZChSR7A=="
        crossorigin=""/>
        <style>
                #mapid """),format.raw/*9.24*/("""{"""),format.raw/*9.25*/("""
                    """),format.raw/*10.21*/("""height: 600px;
                """),format.raw/*11.17*/("""}"""),format.raw/*11.18*/("""
        """),format.raw/*12.9*/("""</style>
            <!-- Make sure you put this AFTER Leaflet's CSS -->
        <script src="https://unpkg.com/leaflet@1.7.1/dist/leaflet.js"
        integrity="sha512-XQoYMqMTK8LvdxXYG3nZ448hOEQiglfqkJs1NOQV44cWnUrBc8PkAOcXy20w0vlaXaVUearIOBhiXZ5V3ynxwA=="
        crossorigin="">

        </script>

        <title>Query 2.3</title>

    <head>
            <meta charset="utf-8">
            <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

            <title>Query 3</title>
            <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
            <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
    </head>

    </head>
    <body>
        <header class="topbar">
            <h1 class="focused" style="font-size: 37px;
                color: #57a957">
                <strong>Query 2.3</strong>
            </h1>
            <form action=""""),_display_(/*38.28*/routes/*38.34*/.HomeController.querySelectionHandler()),format.raw/*38.73*/("""" method="GET">
                <button id="api-search-button" class="btn col s4 offset-s4" type="submit">Return to Query Selection</button>
            </form>
        </header>




        <div id="mapid"></div>
        <script type="text/javascript">

                var mymap = L.map('mapid').setView([51.505, -0.09], 3);

                L.tileLayer('https://api.mapbox.com/styles/v1/"""),format.raw/*51.63*/("""{"""),format.raw/*51.64*/("""id"""),format.raw/*51.66*/("""}"""),format.raw/*51.67*/("""/tiles/"""),format.raw/*51.74*/("""{"""),format.raw/*51.75*/("""z"""),format.raw/*51.76*/("""}"""),format.raw/*51.77*/("""/"""),format.raw/*51.78*/("""{"""),format.raw/*51.79*/("""x"""),format.raw/*51.80*/("""}"""),format.raw/*51.81*/("""/"""),format.raw/*51.82*/("""{"""),format.raw/*51.83*/("""y"""),format.raw/*51.84*/("""}"""),format.raw/*51.85*/("""?access_token=pk.eyJ1IjoiYmVpY2hlbmgiLCJhIjoiY2tsdjl3dTY5MHE2bDMwczU3emY1OW5vMyJ9.VVfIHxS7zO04N1trHAnEmw', """),format.raw/*51.192*/("""{"""),format.raw/*51.193*/("""
                    """),format.raw/*52.21*/("""attribution: 'Map data &copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors, Imagery © <a href="https://www.mapbox.com/">Mapbox</a>',
                    maxZoom: 10,
                    id: 'mapbox/streets-v11',
                    tileSize: 512,
                    zoomOffset: -1,
                    accessToken: 'your.mapbox.access.token'
                """),format.raw/*58.17*/("""}"""),format.raw/*58.18*/(""").addTo(mymap);

                """),_display_(/*60.18*/for(conferenceList <- confereces) yield /*60.51*/{_display_(Seq[Any](format.raw/*60.52*/("""

                """),format.raw/*62.17*/("""L.marker(["""),_display_(/*62.28*/conferenceList/*62.42*/.getX()),format.raw/*62.49*/(""", """),_display_(/*62.52*/conferenceList/*62.66*/.getY()),format.raw/*62.73*/("""]).addTo(mymap).bindPopup("<b>"""),_display_(/*62.104*/conferenceList/*62.118*/.getYear()),format.raw/*62.128*/(""", """),_display_(/*62.131*/conferenceList/*62.145*/.getName()),format.raw/*62.155*/(""", """),_display_(/*62.158*/conferenceList/*62.172*/.getLocation()),format.raw/*62.186*/("""</b>").openPopup();
                """)))}),format.raw/*63.18*/("""

                """),format.raw/*65.17*/("""<!--    var popup = L.popup()-->
                <!--    .setLatLng([51.7, -0.09])-->
                <!--    .setContent("I am a standalone popup.")-->
                <!--    .openOn(mymap);-->

                var popup = L.popup();

                function onMapClick(e) """),format.raw/*72.40*/("""{"""),format.raw/*72.41*/("""
                    """),format.raw/*73.21*/("""popup
                            .setLatLng(e.latlng)
                            .setContent("You clicked the map at " + e.latlng.toString())
                            .openOn(mymap);
                """),format.raw/*77.17*/("""}"""),format.raw/*77.18*/("""

                """),format.raw/*79.17*/("""mymap.on('click', onMapClick);
        </script>
    </body>"""))
      }
    }
  }

  def render(confereces:List[controllers.Conference]): play.twirl.api.HtmlFormat.Appendable = apply(confereces)

  def f:((List[controllers.Conference]) => play.twirl.api.HtmlFormat.Appendable) = (confereces) => apply(confereces)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-03-07T23:21:24.604
                  SOURCE: /Users/huasucaster/Downloads/CS7340-Lab2-Team1/Lab-2-frontend/app/views/response.scala.html
                  HASH: 8e39bb95a8f4f98f1c3a0c2368eff10592395d43
                  MATRIX: 973->1|1108->43|1446->355|1474->356|1523->377|1582->408|1611->409|1647->418|2754->1499|2769->1505|2829->1544|3247->1934|3276->1935|3306->1937|3335->1938|3370->1945|3399->1946|3428->1947|3457->1948|3486->1949|3515->1950|3544->1951|3573->1952|3602->1953|3631->1954|3660->1955|3689->1956|3825->2063|3855->2064|3904->2085|4327->2480|4356->2481|4417->2515|4466->2548|4505->2549|4551->2567|4589->2578|4612->2592|4640->2599|4670->2602|4693->2616|4721->2623|4780->2654|4804->2668|4836->2678|4867->2681|4891->2695|4923->2705|4954->2708|4978->2722|5014->2736|5082->2773|5128->2791|5432->3067|5461->3068|5510->3089|5742->3293|5771->3294|5817->3312
                  LINES: 28->1|33->2|40->9|40->9|41->10|42->11|42->11|43->12|69->38|69->38|69->38|82->51|82->51|82->51|82->51|82->51|82->51|82->51|82->51|82->51|82->51|82->51|82->51|82->51|82->51|82->51|82->51|82->51|82->51|83->52|89->58|89->58|91->60|91->60|91->60|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|94->63|96->65|103->72|103->72|104->73|108->77|108->77|110->79
                  -- GENERATED --
              */
          