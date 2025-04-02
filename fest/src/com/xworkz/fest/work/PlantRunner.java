package com.xworkz.fest.work;

public class PlantRunner {
    public static void main(String[] args) {


        Plant plant = new Tree();
        plant.grow();
        plant.absorbWater();
        plant.photosynthesis();
        plant.oxygenRelease();
        plant.provideShade();




        Tree tree = new Tree();
        tree.produceFruits();
        tree.strongRoots();
        tree.provideWood();
        tree.habitatForAnimals();
        tree.seasonalChanges();
    }
}
