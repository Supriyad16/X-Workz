package com.xworkz.fest.work;

public class Items extends Stationery {

    Items() {
        super();
        System.out.println("Items are part of stationery and used in daily tasks!");
    }

    @Override
    public void write() {
        System.out.println("Pen help in writing.");
    }

    @Override
    public void draw() {
        System.out.println("Colour pencil helps in drawing.");
    }

    @Override
    public void store() {
        System.out.println("Stationery items are stored in drawers.");
    }

    @Override
    public void organize() {
        System.out.println("Stationery items must be organized.");
    }

    @Override
    public void use() {
        System.out.println("Items are used for various purposes.");
    }
}


