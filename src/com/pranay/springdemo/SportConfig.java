package com.pranay.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.pranay.springdemo")
public class SportConfig {
	@Bean
	public FortuneService happyFortuneService()
	{
		return new HappyFortuneService();
	}
	@Bean
	public Coach swimCoach(FortuneService fortuneService) {
		SwimCoach mySwimCoach=new SwimCoach();
		return mySwimCoach;
	}
}
