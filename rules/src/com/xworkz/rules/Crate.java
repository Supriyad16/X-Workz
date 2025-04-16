package com.xworkz.rules;

public class Crate implements Bottle, Box {

    @Override
    public void closeCap() {
        System.out.println("Opening the water bottle cap");
    }

    @Override
    public void pour() {
        System.out.println("Pouring water from the bottle");
    }

    @Override
    public void fill() {
        System.out.println("Refilling the bottle");
    }

    @Override
    public void pack() {
        System.out.println("Packing items into the gift box");
    }

    @Override
    public void seal() {
        System.out.println("Sealing the gift box");
    }

    @Override
    public void open() {
        System.out.println("Unwrapping the gift box");
    }

    public static void main(String[] args) {
        Bottle bottle = new Crate();
        bottle.closeCap();
        bottle.pour();
        bottle.fill();

        Box box = new Crate();
        box.pack();
        box.seal();
        box.open();
    }
}
