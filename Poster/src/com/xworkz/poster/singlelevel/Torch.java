package com.xworkz.poster.singlelevel;

public class Torch {
    String brand;
    String powerType;

    public Torch(String brand, String powerType) {
        this.brand = brand;
        this.powerType = powerType;
    }

    public void turnOn() {
        System.out.println("Torch is turned on");
    }
}
