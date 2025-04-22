package com.xworkz.information.internal;

public class FestivalImp implements Festival {

    public FestivalImp() {
        System.out.println("No-arg constructor of FestivalImp");
    }

    @Override
    public void organize() {
        System.out.println("Organizing festival in FestivalImp");
    }
}
