package com.xworkz.poster.multilevel;

public class Regulator extends Switchboard {

    public Regulator(String brand, String type) {
        super(brand, type);
    }

    public void controlSpeed() {
        System.out.println("Regulator controls fan speed");
    }

    public static void main(String[] args) {
        Regulator regulator = new Regulator("Anchor", "Modular");
        System.out.println("Brand: " + regulator.brand + ", Type: " + regulator.type);
        regulator.on();
        regulator.manageConnections();
        regulator.controlSpeed();
    }
}
