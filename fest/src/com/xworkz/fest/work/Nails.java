package com.xworkz.fest.work;

class Nails extends Finger {
    Nails() {
        super();
        System.out.println("Nails class");
    }

    @Override
    public void hold() {
        System.out.println("Fingers help to hold objects.");
    }

    @Override
    public void type() {
        System.out.println("Fingers are used to type");
    }

    @Override
    public void touch() {
        System.out.println("Fingers helps to sense tke object.");
    }

    @Override
    public void write() {
        System.out.println("Fingers assist in writing.");
    }

    @Override
    public void gesture() {
        System.out.println("Fingers are used to create hand gestures.");
    }
}