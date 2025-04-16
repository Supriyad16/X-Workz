package com.xworkz.rules;

public class WalkingStick implements Stick {

    @Override
    public void hold() {
        System.out.println("Holding the walking stick");
    }

    @Override
    public void hit() {
        System.out.println("Using the walking stick to hit");
    }

    @Override
    public void breakStick() {
        System.out.println("The walking stick broke");
    }

    public static void main(String[] args) {
        WalkingStick stick = new WalkingStick();
        stick.hold();
        stick.hit();
        stick.breakStick();
    }
}
