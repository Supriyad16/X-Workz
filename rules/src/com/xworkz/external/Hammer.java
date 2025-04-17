package com.xworkz.external;

import com.xworkz.rules.*;

public class Hammer implements Shelf, Shoe, Sink, Soap, Spoon {

    @Override
    public void hold() {
        System.out.println("Holding the hammer");
    }

    @Override
    public void organize() {
        System.out.println("Organizing the shelf");
    }

    @Override
    public void wear() {
        System.out.println("Wearing the shoe");
    }

    @Override
    public void lather() {
        System.out.println("Lathering the soap");
    }

    @Override
    public void wash() {
        System.out.println("Washing with the soap");
    }

    @Override
    public void dry() {
        System.out.println("Drying the item");
    }

    @Override
    public void drain() {
        System.out.println("Draining the sink");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the spoon");
    }

    @Override
    public void tie() {
        System.out.println("Tying the shoe");
    }

    @Override
    public void stir() {
        System.out.println("Stirring with the spoon");
    }

    @Override
    public void scoop() {
        System.out.println("Scooping with the spoon");
    }

    @Override
    public void eat() {
        System.out.println("Eating with the spoon");
    }

    public static void main(String[] args) {
        Shelf shelf = new Hammer();
        shelf.organize();
        shelf.hold();
        shelf.clean();

        Shoe shoe = new Hammer();
        shoe.wear();
        shoe.tie();
        shoe.clean();

        Sink sink = new Hammer();
        sink.drain();
        sink.clean();
        sink.wash();

        Soap soap = new Hammer();
        soap.lather();
        soap.wash();
        soap.dry();

        Spoon spoon = new Hammer();
        spoon.stir();
        spoon.scoop();
        spoon.eat();
    }
}
