package com.xworkz.fest.work;

public class Bird extends Animal {

    Bird() {
        super();
        System.out.println("Bird class");
    }

    public void fly() {
        System.out.println("Bird can fly");
    }

    public void sing() {
        System.out.println("Bird can sing");
    }

    public void layEggs() {
        System.out.println("Bird lays eggs");
    }

    public void buildNest() {
        System.out.println("Bird builds a nest");
    }

    public void migrate() {
        System.out.println("Birds migrate in winter");
    }
}
