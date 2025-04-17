package com.xworkz.external;

import com.xworkz.rules.*;

public class Orbit implements Bag, Lens, Frame, Globe, Bottle {

    @Override
    public void carry() {
        System.out.println("Carrying the bag");
    }

    @Override
    public void hold() {
        System.out.println("Holding the bag");
    }

    @Override
    public void store() {
        System.out.println("Storing items in the bag");
    }

    @Override
    public void fill() {
        System.out.println("Filling the bottle");
    }

    @Override
    public void pour() {
        System.out.println("Pouring from the bottle");
    }

    @Override
    public void closeCap() {
        System.out.println("Closing the bottle cap");
    }

    @Override
    public void hang() {
        System.out.println("Hanging the frame");
    }

    @Override
    public void support() {
        System.out.println("Supporting the frame");
    }

    @Override
    public void display() {
        System.out.println("Displaying the frame");
    }

    @Override
    public void rotate() {
        System.out.println("Rotating the globe");
    }

    @Override
    public void point() {
        System.out.println("Pointing at the globe");
    }

    @Override
    public void study() {
        System.out.println("Studying the globe");
    }

    @Override
    public void focus() {
        System.out.println("Focusing the lens");
    }

    @Override
    public void zoom() {
        System.out.println("Zooming the lens");
    }

    @Override
    public void adjust() {
        System.out.println("Adjusting the lens");
    }

    public static void main(String[] args) {

        Bag bag = new Orbit();
        bag.store();
        bag.hold();
        bag.carry();

        Bottle bottle = new Orbit();
        bottle.fill();
        bottle.pour();
        bottle.closeCap();

        Frame frame = new Orbit();
        frame.hang();
        frame.support();
        frame.display();

        Globe globe = new Orbit();
        globe.rotate();
        globe.point();
        globe.study();

        Lens lens = new Orbit();
        lens.focus();
        lens.zoom();
        lens.adjust();
    }
}
