package com.learning.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//create an array of strings
	private String[] data = {
			"Beware of wolf in sheep's clothing",
			"Dilligence is the mother of good luck",
			"Journey is the reward"
	};
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		//pick a random string from array
		int index = myRandom.nextInt(data.length);
		return data[index];
	}

}
