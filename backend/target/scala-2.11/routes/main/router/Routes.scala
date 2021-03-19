
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/huasucaster/Downloads/CS7340-Lab2-Team1/Lab-2-backend/conf/routes
// @DATE:Sun Mar 07 23:19:11 CST 2021

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:9
  PubController_1: controllers.PubController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:9
    PubController_1: controllers.PubController
  ) = this(errorHandler, HomeController_0, PubController_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, PubController_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """findAll""", """controllers.PubController.findAll()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """query1Response""", """controllers.PubController.partOneQueryOne()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """query2Response""", """controllers.PubController.partOneQueryTwo()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """query3Response""", """controllers.PubController.partOneQueryThree()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """query4Response""", """controllers.PubController.partOneQueryFour()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """query5Response""", """controllers.PubController.partOneQueryFive()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """query21Response""", """controllers.PubController.partTwoQueryOne()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """query22Response""", """controllers.PubController.partTwoQueryTwo()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """query23Response""", """controllers.PubController.partTwoQueryThree()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_PubController_findAll1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("findAll")))
  )
  private[this] lazy val controllers_PubController_findAll1_invoker = createInvoker(
    PubController_1.findAll(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PubController",
      "findAll",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """findAll"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_PubController_partOneQueryOne2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("query1Response")))
  )
  private[this] lazy val controllers_PubController_partOneQueryOne2_invoker = createInvoker(
    PubController_1.partOneQueryOne(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PubController",
      "partOneQueryOne",
      Nil,
      "POST",
      """ An example controller showing a sample home page""",
      this.prefix + """query1Response"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_PubController_partOneQueryTwo3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("query2Response")))
  )
  private[this] lazy val controllers_PubController_partOneQueryTwo3_invoker = createInvoker(
    PubController_1.partOneQueryTwo(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PubController",
      "partOneQueryTwo",
      Nil,
      "POST",
      """""",
      this.prefix + """query2Response"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_PubController_partOneQueryThree4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("query3Response")))
  )
  private[this] lazy val controllers_PubController_partOneQueryThree4_invoker = createInvoker(
    PubController_1.partOneQueryThree(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PubController",
      "partOneQueryThree",
      Nil,
      "POST",
      """""",
      this.prefix + """query3Response"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_PubController_partOneQueryFour5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("query4Response")))
  )
  private[this] lazy val controllers_PubController_partOneQueryFour5_invoker = createInvoker(
    PubController_1.partOneQueryFour(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PubController",
      "partOneQueryFour",
      Nil,
      "POST",
      """""",
      this.prefix + """query4Response"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_PubController_partOneQueryFive6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("query5Response")))
  )
  private[this] lazy val controllers_PubController_partOneQueryFive6_invoker = createInvoker(
    PubController_1.partOneQueryFive(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PubController",
      "partOneQueryFive",
      Nil,
      "POST",
      """""",
      this.prefix + """query5Response"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_PubController_partTwoQueryOne7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("query21Response")))
  )
  private[this] lazy val controllers_PubController_partTwoQueryOne7_invoker = createInvoker(
    PubController_1.partTwoQueryOne(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PubController",
      "partTwoQueryOne",
      Nil,
      "POST",
      """""",
      this.prefix + """query21Response"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_PubController_partTwoQueryTwo8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("query22Response")))
  )
  private[this] lazy val controllers_PubController_partTwoQueryTwo8_invoker = createInvoker(
    PubController_1.partTwoQueryTwo(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PubController",
      "partTwoQueryTwo",
      Nil,
      "POST",
      """""",
      this.prefix + """query22Response"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_PubController_partTwoQueryThree9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("query23Response")))
  )
  private[this] lazy val controllers_PubController_partTwoQueryThree9_invoker = createInvoker(
    PubController_1.partTwoQueryThree(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PubController",
      "partTwoQueryThree",
      Nil,
      "POST",
      """""",
      this.prefix + """query23Response"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:9
    case controllers_PubController_findAll1_route(params) =>
      call { 
        controllers_PubController_findAll1_invoker.call(PubController_1.findAll())
      }
  
    // @LINE:12
    case controllers_PubController_partOneQueryOne2_route(params) =>
      call { 
        controllers_PubController_partOneQueryOne2_invoker.call(PubController_1.partOneQueryOne())
      }
  
    // @LINE:14
    case controllers_PubController_partOneQueryTwo3_route(params) =>
      call { 
        controllers_PubController_partOneQueryTwo3_invoker.call(PubController_1.partOneQueryTwo())
      }
  
    // @LINE:16
    case controllers_PubController_partOneQueryThree4_route(params) =>
      call { 
        controllers_PubController_partOneQueryThree4_invoker.call(PubController_1.partOneQueryThree())
      }
  
    // @LINE:18
    case controllers_PubController_partOneQueryFour5_route(params) =>
      call { 
        controllers_PubController_partOneQueryFour5_invoker.call(PubController_1.partOneQueryFour())
      }
  
    // @LINE:20
    case controllers_PubController_partOneQueryFive6_route(params) =>
      call { 
        controllers_PubController_partOneQueryFive6_invoker.call(PubController_1.partOneQueryFive())
      }
  
    // @LINE:22
    case controllers_PubController_partTwoQueryOne7_route(params) =>
      call { 
        controllers_PubController_partTwoQueryOne7_invoker.call(PubController_1.partTwoQueryOne())
      }
  
    // @LINE:24
    case controllers_PubController_partTwoQueryTwo8_route(params) =>
      call { 
        controllers_PubController_partTwoQueryTwo8_invoker.call(PubController_1.partTwoQueryTwo())
      }
  
    // @LINE:26
    case controllers_PubController_partTwoQueryThree9_route(params) =>
      call { 
        controllers_PubController_partTwoQueryThree9_invoker.call(PubController_1.partTwoQueryThree())
      }
  }
}
