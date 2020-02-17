// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/macadmin/Downloads/CitizensEngage back/conf/routes
// @DATE:Fri Feb 14 15:58:15 IST 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:1
package controllers {

  // @LINE:4
  class ReverseComplaintController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:4
    def addComplaint(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "complaint")
    }
  
    // @LINE:5
    def getComplaints(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "getComplaints")
    }
  
  }

  // @LINE:1
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:1
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:7
  class ReverseAdminController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def adminlogin(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "adminlogin")
    }
  
  }

  // @LINE:2
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:2
    def addUser(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "register")
    }
  
    // @LINE:3
    def getUsers(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "getUsers")
    }
  
    // @LINE:6
    def login(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "login")
    }
  
  }


}
