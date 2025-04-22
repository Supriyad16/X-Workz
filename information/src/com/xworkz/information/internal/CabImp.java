package com.xworkz.information.internal;

public class CabImp implements Cab {

    public CabImp() {
        System.out.println("No-arg constructor of CabImp");
    }

    @Override
    public void book() {
        System.out.println("Running book in CabImp");
    }
}
