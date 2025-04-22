package com.xworkz.information.internal;

public class TheaterImp implements Theater {

    public TheaterImp() {
        System.out.println("No-arg constructor of TheatreImp");
    }

    @Override
    public void play() {
        System.out.println("Running play in TheatreImp");
    }
}
