package com.xworkz.fest.work;

public class PotatoRunner {
    public static void main(String[] args) {

        Potato potato = new Veggies();
        potato.grow();
        potato.boiled();
        potato.fried();
        potato.mashed();
        potato.eaten();

        Veggies veggies = new Veggies();
        veggies.grow();
        veggies.boiled();
        veggies.fried();
        veggies.mashed();
        veggies.eaten();
    }
}

