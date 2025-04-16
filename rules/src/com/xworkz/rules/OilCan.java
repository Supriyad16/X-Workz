package com.xworkz.rules;

public class OilCan implements Can {

    @Override
    public void pour() {
        System.out.println("Pouring oil from the can");
    }

    @Override
    public void openLid() {
        System.out.println("Opening the lid of the oil can");
    }

    @Override
    public void refill() {
        System.out.println("Refilling the oil can");
    }

    public static void main(String[] args) {
        OilCan can = new OilCan();
        can.pour();
        can.openLid();
        can.refill();
    }
}
