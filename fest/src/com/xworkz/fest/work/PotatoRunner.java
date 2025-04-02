package com.xworkz.fest.work;

public class PotatoRunner {
    public static void main(String[] args) {

        Potato potato = new Veggies();
        potato.grow();
        potato.beBoiled();
        potato.beFried();
        potato.beMashed();
        potato.beEaten();

        Veggies smartPotato = new Veggies();
        smartPotato.speak();
        smartPotato.runAway();
        smartPotato.startRebellion();
        smartPotato.becomeKing();
        smartPotato.takeOverTheWorld();
    }
}

