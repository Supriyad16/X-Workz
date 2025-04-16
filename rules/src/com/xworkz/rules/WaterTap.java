package com.xworkz.rules;

public class WaterTap implements Tap {

    @Override
    public void open() {
        System.out.println("Opening the water tap");
    }

    @Override
    public void close() {
        System.out.println("Closing the water tap");
    }

    @Override
    public void leak() {
        System.out.println("The water tap is leaking");
    }

    public static void main(String[] args) {
        WaterTap tap = new WaterTap();
        tap.open();
        tap.close();
        tap.leak();
    }
}
