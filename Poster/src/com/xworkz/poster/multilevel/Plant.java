package com.xworkz.poster.multilevel;

public class Plant extends Soil {

    public Plant(String shape, String material) {
        super(shape, material);
    }

    public void grow() {
        System.out.println("Plant is growing with the help of soil and pot");
    }

    public static void main(String[] args) {
        Plant plant = new Plant("Round", "Clay");
        System.out.println("Shape: " + plant.shape + ", Material: " + plant.material);
        plant.hold();
        plant.nourish();
        plant.grow();
    }
}
