package com.xworkz.vacation.internal;

public class AlienRunner {
    public static void main(String[] args) {

        Alien alien = new Martian();
        alien.communicate();
        alien.abductHumans();
        alien.spaceship();
        alien.regenerate();
        alien.eatRocks();

        System.out.println("----");

        Martian martian = new Martian();
        martian.communicate();
        martian.abductHumans();
        martian.spaceship();
        martian.regenerate();
        martian.eatRocks();

        System.out.println("----");

        Galaxy galaxy = new Galaxy();
        galaxy.abductHumans();
        galaxy.bigEyes();
        galaxy.communicate();
        galaxy.eatRocks();
        galaxy.regenerate();
        galaxy.spaceship();
    }
}