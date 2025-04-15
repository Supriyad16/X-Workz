package com.xworkz.poster.multilevel;

public class Switch {

    String brand;
    String type;

    public Switch(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    public void on() {
        System.out.println("Switch is turned ON");
    }
}
