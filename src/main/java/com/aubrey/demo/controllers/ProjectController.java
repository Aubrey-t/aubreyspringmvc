package com.aubrey.demo.controllers;

import com.aubrey.demo.data.entities.Project;
import com.aubrey.demo.data.entities.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;

@Controller
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    //find a project by ID
    @RequestMapping(value="/{projectID}")
    //@PathVariable makes sure the URL template variable is passed to the method argument in ProjectService
    public String findProject(Model model, @PathVariable Long projectID){
        model.addAttribute("project",this.projectService.find(projectID));
        return "project";
    }
    //finds information of all projects
    @RequestMapping(value="/find")
    public String find(Model model){
        model.addAttribute("projects", this.projectService.findAll());
             return "projects";
    }

    @RequestMapping(value="/add",method=RequestMethod.GET)
    public String addProject(Model model){

        model.addAttribute("types",new ArrayList<String>() {{

            add("");
            add("single Year");
            add("Multi Year");
        }});

        model.addAttribute("project",new Project());

        return "project_add";
    }

    //contains some debugging
    //Model attribute says, look into the Model for a class of resources that we can pass the method
    //As an argument
    @RequestMapping(value="/add",method=RequestMethod.POST)
    public String saveProject(@ModelAttribute Project project){
        System.out.println("invoking saveProject");
        System.out.println(project);
        return "project_add";
    }

//    @RequestMapping(value="/add",method=RequestMethod.POST, params={"type=multi"})
//    public String saveMultiYearProject(){
//        System.out.println("invoking saveMultiProject");
//        return "project_add";
//    }
//
//    @RequestMapping(value="/add",method=RequestMethod.POST, params={"type=multi","special"})
//    public String saveSpecialProject(){
//        System.out.println("invoking saveSpecialProject");
//        return "project_add";
//    }
}
