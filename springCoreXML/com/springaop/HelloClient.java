package com.springaop;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.springaop.GreetingService;

public class HelloClient {
	public static void main(String[] args) {
		// Spring Container
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("springCoreXML/applicationContext.xml"));

		// Spring Framework
		 //ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");

		System.out.println("*********");

		GreetingService gs1 = (GreetingService) factory.getBean("gs1");
		GreetingService gs2 = (GreetingService) factory.getBean("gs2");

		gs1.sayGreeting();
		gs2.sayGreeting();
	}
}
