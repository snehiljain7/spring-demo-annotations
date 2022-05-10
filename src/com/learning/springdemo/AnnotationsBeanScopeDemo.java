package com.learning.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsBeanScopeDemo {

	public static void main(String[] args) {

		
		//read spring config file
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
				
		//get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
			
				
		//call a method on the bean
		System.out.println("Checking if both the beans are equal " + (theCoach==alphaCoach));
				
		//close the context
		context.close();
	}

}
