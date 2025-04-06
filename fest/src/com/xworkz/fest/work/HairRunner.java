package com.xworkz.fest.work;

public class HairRunner {
    public static void main(String[] args) {

        Hair hair = new Hairband();
        hair.grow();
        hair.style();
        hair.color();
        hair.wash();
        hair.protect();


        Hairband hairband = new Hairband();
        hairband.grow();
        hairband.style();
        hairband.color();
        hairband.wash();
        hairband.protect();
    }
}
