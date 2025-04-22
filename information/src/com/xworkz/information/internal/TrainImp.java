package com.xworkz.information.internal;

public class TrainImp implements Train {

    public TrainImp() {
        System.out.println("No-arg constructor of TrainImp");
    }

    @Override
    public void depart() {
        System.out.println("Running depart in TrainImp");
    }
}
