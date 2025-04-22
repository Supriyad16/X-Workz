package com.xworkz.information.internal;

public class SweetImp implements Sweet {

    public SweetImp() {
        System.out.println("No-arg constructor of SweetImp");
    }

    @Override
    public void taste() {
        System.out.println("Running taste in SweetImp");
    }
}
