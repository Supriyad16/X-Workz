package com.xworkz.fest.work;

public class Kitten extends Cat {

    Kitten() {
        super();
        System.out.println("HackerCat has entered the system!");
    }

    @Override
    public void meow() {
        System.out.println("The cat Sounds cutely.");
    }

    @Override
    public void sleep() {
        System.out.println("The cat sleeps for 20 hours a day.");
    }

    @Override
    public void eat() {
        System.out.println("The cat is eatisthe food.");
    }

    @Override
    public void play() {
        System.out.println("The cat is playing with a ball.");
    }

    @Override
    public void scratchFurniture() {
        System.out.println("The cat scratches the furniture.");
    }
}



