package com.xworkz.fest.work;

public class FruitRunner {

    public static void main(String[] args) {

        Fruit fruit = new Mango();

        fruit.color();
        fruit.grow();
        fruit.seasonal();
        fruit.taste();
        fruit.vitamins();

        Mango mango = new Mango();

        mango.pickle();
        mango.sour();
        mango.sweet();
        mango.types();
        mango.yellowColor();
    }
}