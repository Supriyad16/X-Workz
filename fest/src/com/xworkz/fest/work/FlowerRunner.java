package com.xworkz.fest.work;

public class FlowerRunner {
    public static void main(String[] args) {

        Flower flower = new Smell();
        flower.bloom();
        flower.absorbSunlight();
        flower.attractBees();
        flower.produceSeeds();
        flower.displayColor();


        Smell smell = new Smell();
        smell.releaseFragrance();
        smell.attractPeople();
        smell.changeIntensity();
        smell.spreadThroughAir();
        smell.combineWithOtherScents();
    }
}
