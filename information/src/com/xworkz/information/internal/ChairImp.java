package com.xworkz.information.internal;

public class ChairImp implements Chair {

    public ChairImp() {
        System.out.println("No-arg constructor of ChairImp");
    }

    @Override
    public void sit() {
        System.out.println("Running sit in ChairImp");
    }
}
