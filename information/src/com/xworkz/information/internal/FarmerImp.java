package com.xworkz.information.internal;

public class FarmerImp implements Farmer {

    public FarmerImp() {
        System.out.println("No-arg constructor of FarmerImp");
    }

    @Override
    public void cultivate() {
        System.out.println("Running cultivate in FarmerImp");
    }
}
