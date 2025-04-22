package com.xworkz.information.external;

import com.xworkz.information.internal.Light;

public class Decoration {

    private Light light;

    public Decoration(Light light) {
        this.light = light;
        System.out.println("Arg constructor of Room");
    }

    public void enterRoom() {
        System.out.println("Entering room...");
        if (this.light != null) {
            this.light.glow();
        } else {
            System.out.println("Light is null");
        }
    }
}
