package com.xworkz.information.internal;

public class PenImp implements Pen {

    public PenImp() {
        System.out.println("No-arg constructor of PenImp");
    }

    @Override
    public void write() {
        System.out.println("Writing with PenImp");
    }
}
