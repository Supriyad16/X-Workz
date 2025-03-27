package com.xworkz.projector;

public class Lamp {

    private int voltage;
   private String warranty;

    Lamp(int voltage, String warranty) {
        this.voltage = voltage;
        this.warranty = warranty;
    }

    void turnOn() {
        System.out.println("Lamp is turned on.");
    }
}

