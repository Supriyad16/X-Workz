package com.xworkz.fest.work;

public class AlienRunner {
    public static void main(String[] args) {

        Alien alien = new Martian();
        alien.communicate();
        alien.abductHumans();
        alien.spaceship();
        alien.regenerate();
        alien.eatRocks();


        Martian martian = new Martian();
        martian.communicate();
        martian.abductHumans();
        martian.spaceship();
        martian.regenerate();
        martian.eatRocks();
    }
}
