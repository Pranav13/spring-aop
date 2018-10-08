package com.springaop;

public class GreetingServiceImpl implements GreetingService {
    private String greeting;

    public GreetingServiceImpl() {
        System.out.println("######## with no arg");
    }

    public GreetingServiceImpl(String greeting) {
        System.out.println("######## with arg");
        this.greeting = greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public void sayGreeting() {
        System.out.println("Hai " + greeting);
    }
}
