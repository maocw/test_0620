package com.test.controller;

import java.util.List;

import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class AbstractValidator {
	
	
	public String helloValidator(Object target, String name, Validator validator){
		BeanPropertyBindingResult errors = new BeanPropertyBindingResult(target, name);
		ValidationUtils.invokeValidator(validator, target, errors);
		if (errors.hasErrors()) {
			List<FieldError> fieldErrors = errors.getFieldErrors();
			for (FieldError fieldError : fieldErrors) {
				if (fieldError!=null) {
					System.out.println(fieldError.getDefaultMessage());
				}
			}
		}
		return null;	
	}

}
