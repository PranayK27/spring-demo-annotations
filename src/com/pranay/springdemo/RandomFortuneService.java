package com.pranay.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//create an array of strings
	private String[] data= {"Beware of the wolf in sheep's clothing",
			"Diligence is the mother of good luck",
			"The journey is the reward"};
	
	//random number generator
	private Random myRandom=new Random();
	
	@Override
	public String getFortune() {
		//pick a random number generator
		
		int index=myRandom.nextInt(data.length);
		
		String theFortune=data[index];
		
		return theFortune;
	}

}
