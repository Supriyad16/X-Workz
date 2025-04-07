package com.xworkz.vacation.internal;

public class Enjoyment extends Joy {

    public void gift(Festival festival){

        festival.clothes();

        if(festival instanceof Joy){

            Joy joy = (Joy) festival;
            joy.clothes();
            joy.food();
            joy.happy();
            joy.play();
            joy.sweets();
            joy.share();
        }
    }
}
