package mao.test.controller;

import java.util.Date;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mao.test.service.ServiceTest;

public class ClientTest {

	public static void main(String args[]){
		BeanFactory beanFactory =  new ClassPathXmlApplicationContext("applicationContext.xml");
		ServiceTest serviceTest = (ServiceTest) beanFactory.getBean("ServiceTest");
		serviceTest.addTest("maocw",new Date());
		serviceTest.delTest("maochuanwei");
	}
}
