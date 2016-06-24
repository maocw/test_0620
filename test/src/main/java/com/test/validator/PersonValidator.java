package com.test.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.test.bo.Person;

public class PersonValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return Person.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		//ValidationUtils.rejectIfEmpty(errors, "userName", null, "用户名为空");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "passWord", null, "密码为空");
		
		Person person = (Person) target;
		if (person.getUserName()!=null && person.getUserName().equals("mao")) {
			errors.rejectValue("userName", null, "用户名不合法");
			return;
		}
	}
	
	

}
