package controllers;

import models.Admin;
import models.AdminRepository;
import play.data.FormFactory;
import play.libs.Json;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Controller;
import play.mvc.Result;
import com.fasterxml.jackson.databind.JsonNode;
import javax.inject.Inject;
import java.util.concurrent.CompletionStage;
import java.util.stream.Collectors;
import static play.libs.Json.toJson;
//import views.html.*;

public class AdminController extends Controller{

    private final FormFactory formFactory;
    private final AdminRepository adminRepository;
    private final HttpExecutionContext ec;

    @Inject
    public AdminController(FormFactory formFactory, AdminRepository adminRepository, HttpExecutionContext ec) {
        this.formFactory = formFactory;
        this.adminRepository = adminRepository;
        this.ec = ec;
    }

    public Result index() {
        return ok();
    }

//    public CompletionStage<Result> addUser() {
//
//        User user= Json.fromJson(request().body().asJson(),User.class);
//
//        return userRepository.add(user).thenApplyAsync(p -> {
//
//            return ok();
//        }, ec.current());
//    }

    public CompletionStage<Result> adminlogin() {

        JsonNode j = request().body().asJson();

        String Adminname = j.get("Adminname").asText();
        String Password = j.get("Password").asText();
//        Admin admin = adminRepository.login(Adminname,Password);
        return adminRepository.adminlogin(Adminname,Password).thenApplyAsync(us->{
            //return ok(Json.toJson(us));
            // return redirect(us.Email);
            return redirect("/adminhome");
        }).exceptionally(e->{return ok("Not a valid user");});
//        if (admin==null) {
//            return ok("Not a valid admin");
//        }
//        else{
//            return redirect("A valid admin"+admin.Adminname);
//        }
    }


//    public CompletionStage<Result> getUsers() {
//        return userRepository.list().thenApplyAsync(userStream -> {
//            return ok(toJson(userStream.collect(Collectors.toList())));
//        }, ec.current());
//    }
//
//    public CompletionStage<Result> deleteUser(){
//        JsonNode requestJson= request().body().asJson();
//        String Name=requestJson.get("name").asText();
//        return userRepository.del(Name).thenApplyAsync(p -> {
//            return ok();
//        }, ec.current());
//    }

}
