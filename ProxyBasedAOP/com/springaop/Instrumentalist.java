package com.springaop;

public class Instrumentalist implements  Performer {
    private Instrument instrument;

    public Instrument getInstrument() {
        System.out.println("Get method is called");
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        System.out.println("Set method is called"+instrument);
        this.instrument = instrument;
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.println("perform is called");
    instrument.play();
    }
}
