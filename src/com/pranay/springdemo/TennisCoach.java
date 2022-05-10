package com.pranay.springdemo;

//import javax.annotation.PostConstruct;
//import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	//BeanLifeCycle methods with Annotations
	//Init Method 
//	@PostConstruct
//	public void doMyStartupStuff(){
//		System.out.println(">>> TennisCoach: inside of doMyStartupStuff()");
//	}
//	
//	//Destroy Method
//	@PreDestroy
//	public void doMyCleanupStuff()
//	{
//		System.out.println(">>> TennisCoach: inside of doMyCleanupStuff()");
//	}

	public TennisCoach()
	{
		System.out.println("TrackCoach>> inside default constructor");
	}
	
	//no need to use setter methods
	
	//define the setter method or make your own method name for method injection
	@Autowired
	public void doSomeCrazyStuff(FortuneService theFortuneService)
	{
		System.out.println("TrackCoach>> inside doSomeCrazyStuff()");
		fortuneService=theFortuneService;
	}
	/* This is constructor injection
	@Autowired
	public TennisCoach(FortuneService theFortuneService)
	{
		fortuneService=theFortuneService;
	}
	*/
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
