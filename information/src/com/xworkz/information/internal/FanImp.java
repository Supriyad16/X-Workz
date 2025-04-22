package com.xworkz.information.internal;

public class FanImp implements Fan {

    public FanImp() {
        System.out.println("No-arg constructor of FanImp");
    }

    @Override
    public void rotate() {
        System.out.println("Fan is rotating in FanImp");
    }
}
