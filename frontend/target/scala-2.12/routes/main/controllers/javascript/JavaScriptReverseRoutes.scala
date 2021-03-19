// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/huasucaster/Downloads/CS7340-Lab2-Team1/Lab-2-frontend/conf/routes
// @DATE:Sun Mar 07 23:21:24 CST 2021

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers.javascript {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:33
    def queryFourHandler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.queryFourHandler",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "query4Response"})
        }
      """
    )
  
    // @LINE:29
    def queryTwoHandler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.queryTwoHandler",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "query2Response"})
        }
      """
    )
  
    // @LINE:17
    def query5: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.query5",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "query5"})
        }
      """
    )
  
    // @LINE:39
    def queryTwoTwoHandler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.queryTwoTwoHandler",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "query22Response"})
        }
      """
    )
  
    // @LINE:13
    def query3: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.query3",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "query3"})
        }
      """
    )
  
    // @LINE:7
    def querySelectionHandler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.querySelectionHandler",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + """"})
          }
        
        }
      """
    )
  
    // @LINE:15
    def query4: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.query4",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "query4"})
        }
      """
    )
  
    // @LINE:11
    def query2: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.query2",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "query2"})
        }
      """
    )
  
    // @LINE:35
    def queryFiveHandler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.queryFiveHandler",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "query5Response"})
        }
      """
    )
  
    // @LINE:9
    def query1: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.query1",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "query1"})
        }
      """
    )
  
    // @LINE:27
    def queryOneHandler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.queryOneHandler",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "query1Response"})
        }
      """
    )
  
    // @LINE:37
    def queryTwoOneHandler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.queryTwoOneHandler",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "query21Response"})
        }
      """
    )
  
    // @LINE:41
    def queryTwoThreeHandler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.queryTwoThreeHandler",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "query23Response"})
        }
      """
    )
  
    // @LINE:31
    def queryThreeHandler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.queryThreeHandler",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "query3Response"})
        }
      """
    )
  
    // @LINE:23
    def query23: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.query23",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "query23"})
        }
      """
    )
  
    // @LINE:19
    def query21: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.query21",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "query21"})
        }
      """
    )
  
    // @LINE:21
    def query22: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.query22",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "query22"})
        }
      """
    )
  
  }

  // @LINE:47
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:47
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
