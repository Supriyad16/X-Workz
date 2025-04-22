package com.xworkz.information.internal;

public class PlanetImp implements Planet {

    public PlanetImp() {
        System.out.println("No-arg constructor of PlanetImp");
    }

    @Override
    public void revolve() {
        System.out.println("Planet is revolving in PlanetImp");
    }
}
