package com.xworkz.external;

import com.xworkz.rules.Lamp;

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

    @Override
    public void light(){
        System.out.println("Desk lamp give light");
    }

    public static void main(String[] args) {
        DeskLamp deskLamp = new DeskLamp();
        deskLamp.switchOn();
        deskLamp.glow();
        deskLamp.switchOff();
        deskLamp.light();
    }
}
