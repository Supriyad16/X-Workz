package com.xworkz.information.internal;

public class GardenImp implements Garden {

    public GardenImp() {
        System.out.println("No-arg constructor of GardenImp");
    }

    @Override
    public void grow() {
        System.out.println("Growing plants in GardenImp");
    }
}
