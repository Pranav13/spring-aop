package com.springaop.test;

import com.springaop.CustomerService1;
import com.springaop.CustomerService2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/annotation_config.xml")
public class AnnotationTest {
    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void itshouldPrintName_Annatation_AOP(){
        CustomerService2 customerService2 = (CustomerService2)applicationContext.getBean("customerService2");
        System.out.println("**************");
        customerService2.printName();
        System.out.println("*****************");
        customerService2.printAddress();
        System.out.println("*****************");

        try {
            customerService2.printThrowsException();
        }catch(Exception e){

        }

    }
}
