// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/huasucaster/Downloads/CS7340-Lab2-Team1/Lab-2-frontend/conf/routes
// @DATE:Sun Mar 07 23:21:24 CST 2021


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
