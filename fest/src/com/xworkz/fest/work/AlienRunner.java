package com.xworkz.fest.work;

public class AlienRunner {
    public static void main(String[] args) {

        Alien alien = new Martian();
        alien.communicate();
        alien.abductHumans();
        alien.controlSpaceship();
        alien.regenerate();
        alien.eatRocks();



        Martian martian = new Martian();
        martian.growTentacles();
        martian.camouflage();
        martian.terraformPlanet();
        martian.summonUFO();
        martian.danceToEarthMusic();
    }
}
