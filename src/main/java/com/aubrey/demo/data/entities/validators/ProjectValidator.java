package com.aubrey.demo.data.entities.validators;

import com.aubrey.demo.data.entities.Project;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class ProjectValidator implements Validator{

    //method is passed in a class
    //checks which class the validator supports
    @Override
    public boolean supports(Class<?> aClass) {

        return Project.class.equals(aClass);
    }

    @Override
    public void validate(Object obj, Errors errors) {

        Project project = (Project) obj;

        if(project.getName().length() < 5){

            errors.rejectValue("name", "project.name","The name is too short");
        }
    }
}
