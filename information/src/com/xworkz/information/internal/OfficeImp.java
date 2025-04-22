package com.xworkz.information.internal;

public class OfficeImp implements Office {

    public OfficeImp() {
        System.out.println("No-arg constructor of OfficeImp");
    }

    @Override
    public void work() {
        System.out.println("Running work in OfficeImp");
    }
}
