package com.pranay.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//read the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the bean from the spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		//check if they are pointing to the same
		boolean result=(theCoach==alphaCoach);
		
		//print out the result
		System.out.println("Pointing the same object: "+result);
		
		System.out.println("Memory location for thecoach: "+theCoach);
		
		System.out.println("Memory location for thecoach: "+alphaCoach);
		
		//close the context
		context.close();
	}

}
