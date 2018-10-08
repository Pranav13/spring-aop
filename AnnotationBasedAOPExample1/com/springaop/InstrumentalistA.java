package com.springaop;

import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class InstrumentalistA {

    public void sing() {
        System.out.println("--- Singing with instrument ---");
    }

    public Integer perform() {
        System.out.println("--- This is 75th performance ---");
        return new Integer(75);
    }

    public void play() throws IOException {
        System.out.println("--- Unable to play, throwing exception ---");
        throw new IOException("Instrument error");
    }

    public void conduct() {
        System.out.println("--- Conducting helpers ---");
    }
}
