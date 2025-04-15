package com.xworkz.poster.multilevel;

public class Pot {

    String shape;
    String material;

    public Pot(String shape, String material) {
        this.shape = shape;
        this.material = material;
    }

    public void hold() {
        System.out.println("Pot is used to hold soil and plant");
    }
}
