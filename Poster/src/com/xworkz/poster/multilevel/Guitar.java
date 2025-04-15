package com.xworkz.poster.multilevel;

public class Guitar {

    String type;
    String brand;

    public Guitar(String type, String brand) {
        this.type = type;
        this.brand = brand;
    }

    public void play() {
        System.out.println("Playing the guitar melodiously");
    }
}
