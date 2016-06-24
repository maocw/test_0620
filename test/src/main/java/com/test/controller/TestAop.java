package com.test.controller;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TestAop {

//	@Pointcut(value = "execution(* com.test.service.*.*(..))")  
//	private void addMethod(){		
//	}
//	
//	@Before("addMethod()")
//	private void beforeAdd(JoinPoint joinPoint){
//		System.out.println("before Add Method...");
//		for (int i = 0; i < joinPoint.getArgs().length; i++) {
//			System.out.println(joinPoint.getArgs()[i]);
//		}
//	}
//	
//	@After("addMethod()")
//	private void afterAdd(){
//		System.out.println("after add Method");
//	}
}
