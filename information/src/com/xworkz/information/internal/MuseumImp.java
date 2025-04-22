package com.xworkz.information.internal;

public class MuseumImp implements Museum {

    public MuseumImp() {
        System.out.println("No-arg constructor of MuseumImp");
    }

    @Override
    public void exhibit() {
        System.out.println("Running exhibit in MuseumImp");
    }
}
