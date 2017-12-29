package com.aubrey.demo.data.entities.validators;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class ProjectValidator implements Validator{

    //method is passed in a class
    @Override
    public boolean supports(Class<?> aClass) {
        return false;
    }

    @Override
    public void validate(Object o, Errors errors) {

    }
}
