package com.xworkz.information.internal;

public class AerospaceImp implements Aerospace {

    public AerospaceImp() {
        System.out.println("No-arg constructor of AerospaceImp");
    }

    @Override
    public void launch() {
        System.out.println("Running launch in AerospaceImp");
    }
}
