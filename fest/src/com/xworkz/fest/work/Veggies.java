package com.xworkz.fest.work;

public class Veggies extends Potato {

    Veggies() {
        super();
        System.out.println("Potato has gained consciousness!");
    }

    @Override
    public void grow() {
        System.out.println("Veggies is growing.");
    }

    @Override
    public void boiled() {
        System.out.println("Veggies is getting boiled");
    }

    @Override
    public void fried() {
        System.out.println("Veggies is now delicious fries!");
    }

    @Override
    public void mashed() {
        System.out.println("Veggies is mashed into a soft texture");
    }

    @Override
    public void eaten() {
        System.out.println("Veggies has been eaten");
    }

}