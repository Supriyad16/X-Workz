package com.xworkz.fest.work;

public class SuperheroRunner {
    public static void main(String[] args) {

        Superhero superhero = new IronMan();
        superhero.fly();
        superhero.fight();
        superhero.superStrength();
        superhero.savePeople();
        superhero.disguiseIdentity();


        IronMan ironMan = new IronMan();
        ironMan.fly();
        ironMan.fight();
        ironMan.superStrength();
        ironMan.savePeople();
        ironMan.disguiseIdentity();
    }
}
