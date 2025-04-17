package com.xworkz.external;

import com.xworkz.rules.Bottle;

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

    @Override
    public void drink(){
        System.out.println("Drink water in water bottle");
    }

    public static void main(String[] args) {
        WaterBottle waterBottle = new WaterBottle();
        waterBottle.fill();
        waterBottle.pour();
        waterBottle.closeCap();
        waterBottle.drink();
    }
}
