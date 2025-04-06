package com.xworkz.fest.work;


class Penguin extends Snow {
    Penguin() {
        super();
        System.out.println("Penguin class");
    }

    @Override
    public void coldWeather() {
        System.out.println("Snow forms in cold weather.");
    }

    @Override
    public void mountains() {
        System.out.println("Snow covers mountains.");
    }

    @Override
    public void melts() {
        System.out.println("Snow melts during heat condition.");
    }

    @Override
    public void usedForSports() {
        System.out.println("Snow is used for winter sports.");
    }

    @Override
    public void reflectsSunlight() {
        System.out.println("Snow reflects sunlight.");
    }
}