package com.xworkz.information.internal;

public class RacketImp implements Racket {

    public RacketImp() {
        System.out.println("No-arg constructor of RacketImp");
    }

    @Override
    public void swing() {
        System.out.println("Swinging the racket in RacketImp");
    }
}
