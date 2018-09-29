package com.springaop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AnnotationAOP {
    @Before("execution(* com.springaop.CustomerService2.*(..))")
    public void beforeService() {
        System.out.println("Before method called");
    }
}
