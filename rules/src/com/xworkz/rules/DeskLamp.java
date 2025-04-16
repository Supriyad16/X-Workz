package com.xworkz.rules;

public class DeskLamp implements Lamp {

    @Override
    public void switchOn() {
        System.out.println("Switching on the desk lamp");
    }

    @Override
    public void switchOff() {
        System.out.println("Switching off the desk lamp");
    }

    @Override
    public void glow() {
        System.out.println("The desk lamp is glowing");
    }

    public static void main(String[] args) {
        DeskLamp lamp = new DeskLamp();
        lamp.switchOn();
        lamp.glow();
        lamp.switchOff();
    }
}
