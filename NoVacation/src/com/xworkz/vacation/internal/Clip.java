package com.xworkz.vacation.internal;

public class Clip extends Hairband{

    public void claw(Hair hair){

        hair.grow();

        if(hair instanceof Hairband){

            Hairband hairband = (Hairband) hair;

            hairband.grow();
            hairband.style();
            hairband.color();
            hairband.wash();
            hairband.protect();
        }
    }
}
