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
		//ValidationUtils.rejectIfEmpty(errors, "userName", null, "�û���Ϊ��");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "passWord", null, "����Ϊ��");
		
		Person person = (Person) target;
		if (person.getUserName()!=null && person.getUserName().equals("mao")) {
			errors.rejectValue("userName", null, "�û������Ϸ�");
			return;
		}
	}
	
	

}
