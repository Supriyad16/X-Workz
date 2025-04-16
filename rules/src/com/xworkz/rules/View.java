package com.xworkz.rules;

public class View implements Glass, Globe {

    @Override
    public void drink() {
        System.out.println("Cleaning the glass");
    }

    @Override
    public void empty() {
        System.out.println("Breaking the glass");
    }

    @Override
    public void fill() {
        System.out.println("Reflecting light through the glass");
    }

    @Override
    public void point() {
        System.out.println("Spinning the globe");
    }

    @Override
    public void rotate() {
        System.out.println("Showing the map on the globe");
    }

    @Override
    public void study() {
        System.out.println("Locating a place on the globe");
    }

    public static void main(String[] args) {
        Glass glass = new View();
        glass.drink();
        glass.empty();
        glass.fill();

        Globe globe = new View();
        globe.point();
        globe.rotate();
        globe.study();
    }
}
