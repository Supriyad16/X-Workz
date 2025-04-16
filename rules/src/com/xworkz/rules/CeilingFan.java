package com.xworkz.rules;

public class CeilingFan implements Fan {

    @Override
    public void spin() {
        System.out.println("Ceiling fan is spinning");
    }

    @Override
    public void switchOn() {
        System.out.println("Switching on the ceiling fan");
    }

    @Override
    public void cleans() {
        System.out.println("Cleaning the ceiling fan");
    }

    public static void main(String[] args) {
        CeilingFan fan = new CeilingFan();
        fan.spin();
        fan.switchOn();
        fan.cleans();
    }
}
