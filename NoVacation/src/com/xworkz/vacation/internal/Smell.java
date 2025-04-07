package com.xworkz.vacation.internal;

class Smell extends Flower {
    Smell() {
        super();
        System.out.println("Smell class");
    }

    @Override
    public void bloom() {
        System.out.println("Flower blooms.");
    }

    @Override
    public void absorbSunlight() {
        System.out.println("Flower absorbs sunlight.");
    }

    @Override
    public void attractBees() {
        System.out.println("Flower attracts bees.");
    }

    @Override
    public void produceSeeds() {
        System.out.println("Flower produces seeds.");
    }

    @Override
    public void displayColor() {
        System.out.println("Flower displays beautiful colors.");
    }
}
