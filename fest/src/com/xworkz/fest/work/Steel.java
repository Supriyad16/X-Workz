package com.xworkz.fest.work;

class Steel extends Bottle {
    Steel() {
        super();
        System.out.println("Steel class");
    }

    @Override
    public void store() {
        System.out.println("Bottles are used to store liquids.");
    }

    @Override
    public void reusable() {
        System.out.println("Many bottles are reusable.");
    }

    @Override
    public void shapes() {
        System.out.println("Bottles come in different shapes.");
    }

    @Override
    public void portable() {
        System.out.println("Bottles are easy to carry.");
    }

    @Override
    public void materials() {
        System.out.println("Bottles can be made of different materials.");
    }

}