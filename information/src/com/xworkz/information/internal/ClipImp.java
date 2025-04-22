package com.xworkz.information.internal;

public class ClipImp implements Clip {

    public ClipImp() {
        System.out.println("No-arg constructor of ClipImp");
    }

    @Override
    public void hold() {
        System.out.println("Running hold in ClipImp");
    }
}
