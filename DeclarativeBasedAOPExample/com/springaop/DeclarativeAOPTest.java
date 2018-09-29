package com.springaop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/declrative_config_aop.xml")
public class DeclarativeAOPTest {
    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void itshouldPrintName(){
        CustomerService1 customerService1 = (CustomerService1)applicationContext.getBean("customerService1");
        System.out.println("**************");
        customerService1.printName();
        System.out.println("*****************");
        customerService1.printAddress();
        System.out.println("*****************");

        try {
            customerService1.printThrowsException();
        }catch(Exception e){

        }

    }
}
