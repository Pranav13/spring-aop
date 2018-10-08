package com.springaop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springaop.beans.GreetingService1;
import com.springaop.config.AppConfig;


public class HelloClient {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("*********************");
		GreetingService1 gs1 = (GreetingService1) context.getBean("gs1");
		GreetingService1 gs2 = (GreetingService1) context.getBean("gs2");

		gs1.sayGreeting();
		gs2.sayGreeting();
	}
}
