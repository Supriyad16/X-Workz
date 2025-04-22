package com.xworkz.information.internal;

public class MobileImp implements Mobile {

    public MobileImp() {
        System.out.println("No-arg constructor of MobileImp");
    }

    @Override
    public void call() {
        System.out.println("Running call in MobileImp");
    }
}
