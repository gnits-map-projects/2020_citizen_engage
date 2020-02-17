// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/macadmin/Downloads/CitizensEngage back/conf/routes
// @DATE:Fri Feb 14 15:58:15 IST 2020

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:1
  HomeController_2: controllers.HomeController,
  // @LINE:2
  UserController_3: controllers.UserController,
  // @LINE:4
  ComplaintController_1: controllers.ComplaintController,
  // @LINE:7
  AdminController_0: controllers.AdminController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:1
    HomeController_2: controllers.HomeController,
    // @LINE:2
    UserController_3: controllers.UserController,
    // @LINE:4
    ComplaintController_1: controllers.ComplaintController,
    // @LINE:7
    AdminController_0: controllers.AdminController
  ) = this(errorHandler, HomeController_2, UserController_3, ComplaintController_1, AdminController_0, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, UserController_3, ComplaintController_1, AdminController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.UserController.addUser"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getUsers""", """controllers.UserController.getUsers"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """complaint""", """controllers.ComplaintController.addComplaint"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getComplaints""", """controllers.ComplaintController.getComplaints"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.UserController.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adminlogin""", """controllers.AdminController.adminlogin"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:1
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_2.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:2
  private[this] lazy val controllers_UserController_addUser1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_UserController_addUser1_invoker = createInvoker(
    UserController_3.addUser,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "addUser",
      Nil,
      "POST",
      this.prefix + """register""",
      """""",
      Seq()
    )
  )

  // @LINE:3
  private[this] lazy val controllers_UserController_getUsers2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getUsers")))
  )
  private[this] lazy val controllers_UserController_getUsers2_invoker = createInvoker(
    UserController_3.getUsers,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "getUsers",
      Nil,
      "GET",
      this.prefix + """getUsers""",
      """""",
      Seq()
    )
  )

  // @LINE:4
  private[this] lazy val controllers_ComplaintController_addComplaint3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("complaint")))
  )
  private[this] lazy val controllers_ComplaintController_addComplaint3_invoker = createInvoker(
    ComplaintController_1.addComplaint,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComplaintController",
      "addComplaint",
      Nil,
      "POST",
      this.prefix + """complaint""",
      """""",
      Seq()
    )
  )

  // @LINE:5
  private[this] lazy val controllers_ComplaintController_getComplaints4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getComplaints")))
  )
  private[this] lazy val controllers_ComplaintController_getComplaints4_invoker = createInvoker(
    ComplaintController_1.getComplaints,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComplaintController",
      "getComplaints",
      Nil,
      "GET",
      this.prefix + """getComplaints""",
      """""",
      Seq()
    )
  )

  // @LINE:6
  private[this] lazy val controllers_UserController_login5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_UserController_login5_invoker = createInvoker(
    UserController_3.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "login",
      Nil,
      "POST",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_AdminController_adminlogin6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adminlogin")))
  )
  private[this] lazy val controllers_AdminController_adminlogin6_invoker = createInvoker(
    AdminController_0.adminlogin,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "adminlogin",
      Nil,
      "POST",
      this.prefix + """adminlogin""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:1
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_2.index)
      }
  
    // @LINE:2
    case controllers_UserController_addUser1_route(params@_) =>
      call { 
        controllers_UserController_addUser1_invoker.call(UserController_3.addUser)
      }
  
    // @LINE:3
    case controllers_UserController_getUsers2_route(params@_) =>
      call { 
        controllers_UserController_getUsers2_invoker.call(UserController_3.getUsers)
      }
  
    // @LINE:4
    case controllers_ComplaintController_addComplaint3_route(params@_) =>
      call { 
        controllers_ComplaintController_addComplaint3_invoker.call(ComplaintController_1.addComplaint)
      }
  
    // @LINE:5
    case controllers_ComplaintController_getComplaints4_route(params@_) =>
      call { 
        controllers_ComplaintController_getComplaints4_invoker.call(ComplaintController_1.getComplaints)
      }
  
    // @LINE:6
    case controllers_UserController_login5_route(params@_) =>
      call { 
        controllers_UserController_login5_invoker.call(UserController_3.login)
      }
  
    // @LINE:7
    case controllers_AdminController_adminlogin6_route(params@_) =>
      call { 
        controllers_AdminController_adminlogin6_invoker.call(AdminController_0.adminlogin)
      }
  }
}
