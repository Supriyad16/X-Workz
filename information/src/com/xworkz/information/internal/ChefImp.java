package com.xworkz.information.internal;

public class ChefImp implements Chef {

    public ChefImp() {
        System.out.println("No-arg constructor of ChefImp");
    }

    @Override
    public void cook() {
        System.out.println("Running cook in ChefImp");
    }
}
