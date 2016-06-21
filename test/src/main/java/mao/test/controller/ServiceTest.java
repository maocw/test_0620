package mao.test.controller;

import java.util.Date;

public class ServiceTest {
	
	public void addTest(String name,Date date){
		System.out.println("############add method test###########"+name+" at "+ date);
	}
	
	public void delTest(String name ){
		System.out.println("############del method test############" + name);
	}
}
