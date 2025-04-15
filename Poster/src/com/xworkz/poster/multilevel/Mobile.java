package com.xworkz.poster.multilevel;

public class Mobile {

    String brand;
    String model;

    public Mobile(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void call() {
        System.out.println("Making a call using mobile");
    }
}
