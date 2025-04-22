package com.xworkz.information.internal;

public class ScrewImp implements Screw {

    public ScrewImp() {
        System.out.println("No-arg constructor of ScrewImp");
    }

    @Override
    public void tighten() {
        System.out.println("Running tighten in ScrewImp");
    }
}
