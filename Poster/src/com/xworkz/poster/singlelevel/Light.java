package com.xworkz.poster.singlelevel;

public class Light extends Torch {

    public Light(String brand, String powerType) {
        super(brand, powerType);
    }

    public void glow() {
        System.out.println("Light is glowing brightly");
    }

    public static void main(String[] args) {
        Light light = new Light("Philips", "Battery");
        System.out.println("Brand: " + light.brand + ","+" Power Type: " + light.powerType);
        light.turnOn();
        light.glow();
    }
}
