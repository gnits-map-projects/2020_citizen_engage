package controllers;

import models.Complaint;
import models.ComplaintRepository;
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

public class ComplaintController extends Controller{

    private final FormFactory formFactory;
    private final ComplaintRepository complaintRepository;
    private final HttpExecutionContext ec;

    @Inject
    public ComplaintController(FormFactory formFactory, ComplaintRepository complaintRepository, HttpExecutionContext ec) {
        this.formFactory = formFactory;
        this.complaintRepository = complaintRepository;
        this.ec = ec;
    }

    public Result index() {
        return ok();
    }

    public CompletionStage<Result> addComplaint() {

        Complaint complaint= Json.fromJson(request().body().asJson(),Complaint.class);

        return complaintRepository.add(complaint).thenApplyAsync(p -> {

            return ok();
        }, ec.current());
    }

//    public CompletionStage<Result> loginUser() {
//
//        User user= Json.fromJson(request().body().asJson(),User.class);
//
//        String EMAIL = requestJson.get("Email").asText();
//        String PASSWORD = requestJson.get("Password").asText();
//
//        return userRepository.log(EMAIL,PASSWORD).thenApplyAsync(p -> {
//
//            return ok();
//        }, ec.current());
//    }


    public CompletionStage<Result> getComplaints() {
        return complaintRepository.list().thenApplyAsync(complaintStream -> {
            return ok(toJson(complaintStream.collect(Collectors.toList())));
        }, ec.current());
    }

//    public CompletionStage<Result> deleteUser(){
//        JsonNode requestJson= request().body().asJson();
//        String Name=requestJson.get("name").asText();
//        return userRepository.del(Name).thenApplyAsync(p -> {
//            return ok();
//        }, ec.current());
    //}

}
