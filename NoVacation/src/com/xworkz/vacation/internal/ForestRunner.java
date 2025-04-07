package com.xworkz.vacation.internal;

public class ForestRunner {
    public static void main(String[] args) {

        Forest forest = new Lion();
        forest.providesOxygen();
        forest.shelter();
        forest.largeArea();
        forest.ecosystem();
        forest.resources();


        Lion lion = new Lion();
        lion.providesOxygen();
        lion.shelter();
        lion.largeArea();
        lion.ecosystem();
        lion.resources();


        Tiger tiger = new Tiger();
        tiger.providesOxygen();
        tiger.shelter();
        tiger.largeArea();
        tiger.ecosystem();
        tiger.resources();
    }
}

