package com.learning.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	
	
	public CricketCoach() {
		super();
		System.out.println("Inside default constructor");
	}



	//our setter method
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket coach inside setter method");
		this.fortuneService = fortuneService;
	}



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



}