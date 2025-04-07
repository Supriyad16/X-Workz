package com.xworkz.vacation.internal;

public class FruitRunner {

    public static void main(String[] args) {

        Fruit fruit = new Mango();
        fruit.color();
        fruit.grow();
        fruit.seasonal();
        fruit.taste();
        fruit.vitamins();


        Mango mango = new Mango();
        mango.color();
        mango.grow();
        mango.seasonal();
        mango.taste();
        mango.vitamins();

        Grapes grapes = new Grapes();
        grapes.color();
        grapes.grow();
        grapes.seasonal();
        grapes.taste();
        grapes.vitamins();
    }
}