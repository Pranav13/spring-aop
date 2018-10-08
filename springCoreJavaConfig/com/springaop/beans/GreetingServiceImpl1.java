package com.springaop.beans;

public class GreetingServiceImpl1 implements GreetingService1 {
	private String greeting;

	public GreetingServiceImpl1() {
		//System.out.println("########");
	}

	public GreetingServiceImpl1(String greeting) {
		//System.out.println("########");
		this.greeting = greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public void sayGreeting() {
		System.out.println("Hai " + greeting);
	}
}
