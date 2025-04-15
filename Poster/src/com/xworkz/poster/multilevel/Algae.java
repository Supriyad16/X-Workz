package com.xworkz.poster.multilevel;

public class Algae {

    String type;
    String color;

    public Algae(String type, String color) {
        this.type = type;
        this.color = color;
    }

    public void grow() {
        System.out.println("Algae grows in moist places");
    }
}
