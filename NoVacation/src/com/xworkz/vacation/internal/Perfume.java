package com.xworkz.vacation.internal;

public class Perfume extends Smell{

    public void fragrance(Flower flower){

        flower.bloom();

        if (flower instanceof Smell){

            Smell smell = (Smell) flower;
            smell.bloom();
            smell.absorbSunlight();
            smell.attractBees();
            smell.produceSeeds();
            smell.displayColor();
        }
    }
}
