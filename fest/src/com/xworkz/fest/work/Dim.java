package com.xworkz.fest.work;

class Dim extends Bulb {
    Dim() {
        super();
        System.out.println("Dim class");
    }

    @Override
    public void light() {
        System.out.println("The bulb produces.");
    }

    @Override
    public void consumeElectricity() {
        System.out.println("Bulbs consume electricity.");
    }

    @Override
    public void colours() {
        System.out.println("Bulbs are available in different colours.");
    }

    @Override
    public void shapes() {
        System.out.println("Bulbs are available in different types.");
    }

    @Override
    public void brightness() {
        System.out.println("Bulbs have different brightness levels..");
    }
}