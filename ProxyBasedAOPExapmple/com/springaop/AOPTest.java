package com.springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springConfig.xml");
        CustomerService customerService = (CustomerService)applicationContext.getBean("customerServiceProxy");
        System.out.println("*******************");
        customerService.printName();
        System.out.println("*******************");
        customerService.printAddress();
        System.out.println("**********************");
        try {
            customerService.printThrowException();
        }catch (Exception e){

        }

    }
}
