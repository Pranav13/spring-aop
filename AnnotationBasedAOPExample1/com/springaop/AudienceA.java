package com.springaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AudienceA {

    @Before("execution(* com.springaop.InstrumentalistA.sing())")
    public void takeSeat() {
        System.out.println("Taking seats");
    }

    @Before("execution(* com.springaop.InstrumentalistA.sing())")
    public void switchOffPhone(JoinPoint jp) {
        System.out.println("Switching off mobile phones. Method intercepted: " + jp.getSignature().getName());
    }

    @After("execution(* com.springaop.InstrumentalistA.sing())")
    public void lightsOn() {
        System.out.println("Lights are on for audience");
    }

    @AfterReturning(pointcut = "execution(* com.springaop.InstrumentalistA.perform())", returning = "val")
    public void applaud(Object val) {
        System.out.println("Praising. Intercepted method returned: " + val);
    }

    @AfterThrowing(pointcut = "execution(* com.springaop.InstrumentalistA.play())", throwing = "ex")
    public void demandRefund(Throwable ex) {
        System.out.println("Demanding refund. Exception message: " + ex.getMessage());
    }

    @Around("execution(* com.springaop.InstrumentalistA.conduct())")
    public void manage(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Around advice before method: " + pjp.getSignature().getName());
        pjp.proceed();
        System.out.println("Around advice after method execution");
    }
}
