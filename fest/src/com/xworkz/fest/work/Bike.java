package com.xworkz.fest.work;

public class Bike extends TwoWheeler {

    Bike() {
        super();
        System.out.println("Bike class");
    }

    @Override
    public void start() {
        System.out.println("Bike get starts");
    }

    @Override
    public void stop() {
        System.out.println("Bike stops");
    }

    @Override
    public void fuel() {
        System.out.println("Bike needs fuel");
    }

    @Override
    public void horn() {
        System.out.println("Bike has a horn");
    }

    @Override
    public void accelerate() {
        System.out.println("Bike is accelerating");
    }
}
