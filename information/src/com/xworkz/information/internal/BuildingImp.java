package com.xworkz.information.internal;

public class BuildingImp implements Building {

    public BuildingImp() {
        System.out.println("No-arg constructor of BuildingImp");
    }

    @Override
    public void construct() {
        System.out.println("Running construct in BuildingImp");
    }
}
