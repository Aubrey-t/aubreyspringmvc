package com.aubrey.demo.controllers;

import com.aubrey.demo.data.entities.services.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Controller
@RequestMapping("/resource")
@SessionAttributes("resource")
public class ResourceController {

    @RequestMapping("/add")
    public  String add(){
        System.out.println("Invoking Add()");
        if(1==1){
            throw new RuntimeException("There was an error");
        }
        return "resource_add";
    }

    @ExceptionHandler(NullPointerException.class)
    public String handleError(HttpServletRequest request){
        return "controller_error";
    }

    @RequestMapping("/request")
    @ResponseBody
    //in case we wanted to use some of the fields on the resource to formulate an email
    public String request(@ModelAttribute("resource")Resource resource){
        //Send out an email for request(Out of spring mvc level)
        return "The request has been sent for approval";
    }

    @RequestMapping("/review")
    public String review(@ModelAttribute Resource resource){
        System.out.println("Invoking review()");
        return "resource_review";
    }

    @RequestMapping(value="/save",method= RequestMethod.GET)
    public String save(@ModelAttribute Resource resource, SessionStatus status){
        System.out.println("Invoking Save");
        System.out.println(resource);
        status.setComplete();//remove the attributes of the previous session(not working)
        return "redirect:/resource/add";
    }


    @ModelAttribute("resource")
    public Resource getResource(){
        System.out.println("Adding a new resource to the model");
        return new Resource();
    }

    @ModelAttribute("checkOptions")
    public List<String> getChecks(){
        return new LinkedList<>(Arrays.asList("Lead Time", "Special Rate", "Requires Approval"));
    }

    @ModelAttribute("typeOptions")
    public List<String> getTypes(){

        return new LinkedList<>(Arrays.asList(new String[]{
                "Material", "Other", "Staff", "Technical Equipment" }));
    }

    @ModelAttribute("radioOptions")
    public List<String> getRadios(){

        return new LinkedList<>(Arrays.asList(new String[]{
                "Hours", "Piece", "Tons"
        }));
    }



}
