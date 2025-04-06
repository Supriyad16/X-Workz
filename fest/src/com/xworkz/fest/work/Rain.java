package com.xworkz.fest.work;

class Rain extends Season {
    Rain() {
        super();
        System.out.println("Rain class");
    }

    @Override
    public void weather() {
        System.out.println("Season changes.");
    }

    @Override
    public void temperature() {
        System.out.println("Season changes the temperature.");
    }

    @Override
    public void impactNature() {
        System.out.println("Season impacts nature.");
    }

    @Override
    public void bringFestivals() {
        System.out.println("Season brings festivals.");
    }

    @Override
    public void fruits() {
        System.out.println("Some fruits are seasonal.");
    }

}