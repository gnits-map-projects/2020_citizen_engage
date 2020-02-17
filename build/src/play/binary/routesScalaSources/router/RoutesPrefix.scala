// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/macadmin/Downloads/CitizensEngage back/conf/routes
// @DATE:Fri Feb 14 15:58:15 IST 2020


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
