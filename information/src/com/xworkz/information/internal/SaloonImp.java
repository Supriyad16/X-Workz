package com.xworkz.information.internal;

public class SaloonImp implements Saloon {

    public SaloonImp() {
        System.out.println("No-arg constructor of SaloonImp");
    }

    @Override
    public void groom() {
        System.out.println("Running groom in SaloonImp");
    }
}
