package com.xworkz.external;

import com.xworkz.rules.Fan;

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

    @Override
    public void switchOff(){
        System.out.println("Switch off the fan");
    }

    public static void main(String[] args) {
        CeilingFan ceilingFan = new CeilingFan();
        ceilingFan.spin();
        ceilingFan.switchOn();
        ceilingFan.cleans();
        ceilingFan.switchOff();
    }
}