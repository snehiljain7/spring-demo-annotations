package com.learning.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		//read spring config file
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
		
		//read spring config file
		ClassPathXmlApplicationContext context1= new ClassPathXmlApplicationContext("applicationContext.xml");
				
		//get the bean from spring container
		Coach crickeCoach = context1.getBean("cricketCoach", Coach.class);
			
				
		//call a method on the bean
		System.out.println(crickeCoach.getDailyWorkout());
		System.out.println(crickeCoach.getDailyFortune());
				
		//close the context
		context1.close();
	}

}
