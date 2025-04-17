package com.xworkz.external;

import com.xworkz.rules.*;

public class Chalk implements File, Hat, Jar, Glass, Globe {

    @Override
    public void open() {
        System.out.println("Opening the file");
    }

    @Override
    public void store() {
        System.out.println("Storing in the file");
    }

    @Override
    public void read() {
        System.out.println("Reading the file");
    }

    @Override
    public void close() {
        System.out.println("Closing the file");
    }

    @Override
    public void fill() {
        System.out.println("Filling the jar");
    }

    @Override
    public void drink() {
        System.out.println("Drinking from the glass");
    }

    @Override
    public void empty() {
        System.out.println("Emptying the jar");
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
        System.out.println("Studying with the globe");
    }

    @Override
    public void wear() {
        System.out.println("Wearing the hat");
    }

    @Override
    public void remove() {
        System.out.println("Removing the hat");
    }

    @Override
    public void style() {
        System.out.println("Styling the hat");
    }

    public static void main(String[] args) {
        File file = new Chalk();
        file.open();
        file.read();
        file.close();

        Jar jar = new Chalk();
        jar.open();
        jar.store();
        jar.close();

        Glass glass = new Chalk();
        glass.drink();
        glass.empty();
        glass.fill();

        Globe globe = new Chalk();
        globe.rotate();
        globe.point();
        globe.study();

        Hat hat = new Chalk();
        hat.wear();
        hat.remove();
        hat.style();
    }
}
