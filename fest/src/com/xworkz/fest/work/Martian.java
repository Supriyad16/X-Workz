package com.xworkz.fest.work;

public class Martian extends Alien {

    Martian() {
        super();
        System.out.println("Martian has arrived from Mars");
    }

    @Override
    public void communicate() {
        System.out.println("Martian communicates using telepathy");
    }

    @Override
    public void abductHumans() {
        System.out.println("Martian abducts a human for experiments");
    }

    @Override
    public void spaceship() {
        System.out.println("Martian pilots a spaceship");
    }

    @Override
    public void regenerate() {
        System.out.println("Martian regenerates lost limbs");
    }

    @Override
    public void eatRocks() {
        System.out.println("Martian eats space rocks for energy");
    }
}
