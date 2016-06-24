package com.test.bo;

import com.mongodb.ReflectionDBObject;

public class User extends ReflectionDBObject{
	
	public String name;
	public int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
}
