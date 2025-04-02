package com.xworkz.fest.work;

public class SuperheroRunner {
    public static void main(String[] args) {

        Superhero superhero = new IronMan();
        superhero.fly();
        superhero.fightVillains();
        superhero.useSuperStrength();
        superhero.savePeople();
        superhero.disguiseIdentity();



        IronMan ironMan = new IronMan();
        ironMan.activateSuit();
        ironMan.launchMissiles();
        ironMan.useArcReactor();
        ironMan.scanForThreats();
        ironMan.buildNewTechnology();
    }
}
