package com.xworkz.rules;

public class WaterBottle implements Bottle {

    @Override
    public void fill() {
        System.out.println("Filling the water bottle");
    }

    @Override
    public void pour() {
        System.out.println("Pouring from the water bottle");
    }

    @Override
    public void closeCap() {
        System.out.println("Closing the cap of the water bottle");
    }

    public static void main(String[] args) {
        WaterBottle bottle = new WaterBottle();
        bottle.fill();
        bottle.pour();
        bottle.closeCap();
    }
}
