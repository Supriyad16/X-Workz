package com.xworkz.vacation.internal;

public class Mango extends Fruit {

    Mango() {
        super();
        System.out.println("Mango is created");
    }

    @Override
    public void taste() {
        System.out.println("Mango have different tastes");
    }

    @Override
    public void color() {
        System.out.println("Mango come in various colors");
    }

    @Override
    public void vitamins() {
        System.out.println("Mango provide essential vitamins");
    }

    @Override
    public void grow() {
        System.out.println("Mango grow on trees or plants");
    }

    @Override
    public void seasonal() {
        System.out.println("Mango fruits are seasonal");
    }
}