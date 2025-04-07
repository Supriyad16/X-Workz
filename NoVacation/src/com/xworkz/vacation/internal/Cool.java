package com.xworkz.vacation.internal;

class Cool extends Ice {
    Cool() {
        super();
        System.out.println("Cool class");
    }

    @Override
    public void freeze() {
        System.out.println("Ice is freezing when it is cool.");
    }

    @Override
    public void melt() {
        System.out.println("Ice is melting when its hot.");
    }

    @Override
    public void floatOnWater() {
        System.out.println("Ice is floats on water.");
    }

    @Override
    public void temperature() {
        System.out.println("Ice is maintaining a low temperature when its cool.");
    }

    @Override
    public void crystals() {
        System.out.println("Ice is forms a crystals when its cool.");
    }
}