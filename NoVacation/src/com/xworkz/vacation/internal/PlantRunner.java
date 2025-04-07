package com.xworkz.vacation.internal;


public class PlantRunner {
    public static void main(String[] args) {

        Plant plant = new Tree();
        plant.grow();
        plant.absorbWater();
        plant.photosynthesis();
        plant.oxygenRelease();
        plant.provideShade();

        Tree tree = new Tree();
        tree.grow();
        tree.absorbWater();
        tree.photosynthesis();
        tree.oxygenRelease();
        tree.provideShade();

        Seeds seeds = new Seeds();
        seeds.grow();
        seeds.absorbWater();
        seeds.photosynthesis();
        seeds.oxygenRelease();
        seeds.provideShade();
    }

}
