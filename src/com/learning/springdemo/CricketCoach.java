package com.learning.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	
	
	public CricketCoach() {
		super();
		System.out.println("Inside default constructor");
	}


	/*
	@Autowired
	public void doSomeStuff(FortuneService fortuneService) {
		System.out.println("Cricket coach inside doSomeStuff method");
		this.fortuneService = fortuneService;
	}*/



	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	//define init method
	@PostConstruct
	public void doSomeStuffAfter() {
		System.out.println("Calling init method inside CricketCoach");
	}
	
	//define destroy method 
	@PreDestroy
	public void doSomeStuffBefore() {
		System.out.println("Calling destroy method inside CricketCoach");
	}
	
	



}
