package com.xworkz.information.internal;

public class ParkImp implements Park {

    public ParkImp() {
        System.out.println("No-arg constructor of ParkImp");
    }

    @Override
    public void enjoy() {
        System.out.println("Running enjoy in ParkImp");
    }
}
