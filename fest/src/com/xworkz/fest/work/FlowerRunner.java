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
        smell.bloom();
        smell.absorbSunlight();
        smell.attractBees();
        smell.produceSeeds();
        smell.displayColor();
    }
}
