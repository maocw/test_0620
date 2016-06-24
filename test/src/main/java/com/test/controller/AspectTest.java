package com.test.controller;

import org.apache.jasper.tagplugins.jstl.core.Out;
import org.aspectj.lang.JoinPoint;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import com.test.bo.User;

public class AspectTest {
	
//	public void aopTest(JoinPoint joinPoint){
//		for (int i = 0; i < joinPoint.getArgs().length; i++) {
//			System.out.println("param is "+joinPoint.getArgs()[i]);
//		}
//		System.out.println(joinPoint.getSignature().getName());
//	}	
	public static void main(String args[]){
		try {
			Mongo mongo = new Mongo();
			DB db = mongo.getDB("test");
			DBCollection collection = db.getCollection("userTable");
			  for(int i=1; i<=10; i++) {  
		            User user = new User();  
		            user.setName("user "+(10+i));  
		            user.setAge(10+i);  				  
		            collection.insert(user);  
		        }  		
			DBCursor cursor = collection.find();
			while(cursor.hasNext()){
				System.out.println(cursor.next());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}

}
