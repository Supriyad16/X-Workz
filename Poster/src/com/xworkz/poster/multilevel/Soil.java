package com.xworkz.poster.multilevel;

public class Soil extends Pot {

    public Soil(String shape, String material) {
        super(shape, material);
    }

    public void nourish() {
        System.out.println("Soil provides nutrients to the plant");
    }
}
