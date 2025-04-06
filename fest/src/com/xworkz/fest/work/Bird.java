package com.xworkz.fest.work;

public class Bird extends Animal {

    Bird() {
        super();
        System.out.println("Bird class");
    }

    @Override
    public void eat() {
        System.out.println("Bird is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Bird is sleeping");
    }

    @Override
    public void breathe() {
        System.out.println("Bird is breathing");
    }

    @Override
    public void move() {
        System.out.println("Bird is moving");
    }

    @Override
    public void grow() {
        System.out.println("Bird is growing");
    }
}
