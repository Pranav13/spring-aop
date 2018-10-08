package com.springaop.test;

import com.springaop.InstrumentalistA;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/BeanAnnot.xml")
public class TestAOP {
    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void itshoulPassAllJoinPoint(){
        InstrumentalistA inst = (InstrumentalistA) applicationContext.getBean("instrumentalistA");
        inst.sing();
        inst.perform();
        try {
            inst.play();
        } catch (IOException e) {
        }
        inst.conduct();
    }
}
