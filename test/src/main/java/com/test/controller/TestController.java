package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ValidationUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.bo.Person;
import com.test.validator.PersonValidator;

@Controller
public class TestController extends AbstractValidator{
		
	@Autowired
	private PersonValidator personValidator;

	@RequestMapping(value="/handlerAdapterTest",method=RequestMethod.GET)
	@ResponseBody
	public void handlerAdapter(){
		System.out.println("test github");
	}
	
	@RequestMapping(value="/filterTest",method=RequestMethod.GET)
	@ResponseBody
	public void FilterTest(){
		
	}
	
	@RequestMapping(value="/validator",method=RequestMethod.GET)
	@ResponseBody
	public void validatorTest(Person person ){
		super.helloValidator(person, "person", personValidator);
	}
}
