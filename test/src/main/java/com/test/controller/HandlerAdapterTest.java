package com.test.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class HandlerAdapterTest extends HandlerInterceptorAdapter {
	

//	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
//		    throws Exception {
//		String url = request.getRequestURI().toString();
//		System.out.println(new Date()+": " + url+ "...");
//		return true;	
//		}

}
