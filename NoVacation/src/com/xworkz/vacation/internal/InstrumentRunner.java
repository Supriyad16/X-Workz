package com.xworkz.vacation.internal;

public class InstrumentRunner {

    public static void main(String[] args) {

        Instrument instrument = new Piano();
        instrument.play();
        instrument.tune();
        instrument.repair();
        instrument.store();
        instrument.amplify();


        Piano piano = new Piano();
        piano.play();
        piano.tune();
        piano.repair();
        piano.store();
        piano.amplify();

        Song song = new Song();
        song.play();
        song.tune();
        song.repair();
        song.store();
        song.amplify();
    }
}
