package com.xworkz.fest.work;

public class Bus extends Transport {

    Bus() {
        super();
        System.out.println("Bus class");
    }

    @Override
    public void move() {

        System.out.println("Bus is moving");
    }

    @Override
    public void stop() {

        System.out.println("Bus is stopping");
    }

    @Override
    public void fuel() {

        System.out.println("Bus needs fuel");
    }

    @Override
    public void capacity() {

        System.out.println("Bus has a capacity limit");
    }

    @Override
    public void route() {

        System.out.println("Bus follows a specific route");
    }
}
