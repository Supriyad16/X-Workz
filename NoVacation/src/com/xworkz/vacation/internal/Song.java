package com.xworkz.vacation.internal;

public class Song extends Piano{

    public void music(Instrument instrument){
        instrument.play();

        if (instrument instanceof Piano){
            Piano piano = (Piano) instrument;
            piano.play();
            piano.tune();
            piano.repair();
            piano.store();
            piano.amplify();
        }
    }
}
