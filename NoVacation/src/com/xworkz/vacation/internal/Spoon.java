package com.xworkz.vacation.internal;

public class Spoon extends Plate {

    Spoon() {
        super();
        System.out.println("This is a spoon");
    }

    @Override
    public void hold() {
        System.out.println("Plate holds food and spoon.");
    }

    @Override
    public void clean() {
        System.out.println("Clean the plate.");
    }

    @Override
    public void material() {
        System.out.println("Plates are made of materials");
    }

    @Override
    public void shape() {
        System.out.println("Plates can be round.");
    }

    @Override
    public void size() {
        System.out.println("Plates come in sizes.");
    }
}
