package com.springaop.config;

import com.springaop.beans.GreetingService1;
import com.springaop.beans.GreetingServiceImpl1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.springaop.beans.GreetingService1;
import com.springaop.beans.GreetingServiceImpl1;

@Configuration
public class AppConfig {
	@Bean(name = "gs1")
	@Scope(value = "singleton")
	public GreetingService1 getGs1() {
		GreetingServiceImpl1 gs = new GreetingServiceImpl1();
		gs.setGreeting("Good Morning");
		return gs;
	}

	@Bean(name = "gs2")
	public GreetingService1 getGs2() {
		GreetingServiceImpl1 gs = new GreetingServiceImpl1("Good Evening");
		return gs;
	}
}