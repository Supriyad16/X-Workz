package com.xworkz.fest.work;

public class InstrumentRunner {
    public static void main(String[] args) {

        Instrument instrument = new Piano();
        instrument.play();
        instrument.tune();
        instrument.repair();
        instrument.store();
        instrument.amplify();



        Piano piano = new Piano();
        piano.strum();
        piano.adjustStrings();
        piano.changeTones();
        piano.plugIn();
        piano.fingerpicking();
    }
}
