package com.xworkz.external;

import com.xworkz.rules.*;

public class Doll implements Bench, Box, Bed, Basket, Door {

    @Override
    public void close() {
        System.out.println("Basket close");
    }

    @Override
    public void lock() {
        System.out.println("Basket lock");
    }

    @Override
    public void carryItems() {
        System.out.println("Basket carry");
    }

    @Override
    public void sleep() {
        System.out.println("Bed sleep");
    }

    @Override
    public void fold() {
        System.out.println("Bed fold");
    }

    @Override
    public void makeBed() {
        System.out.println("Bed");
    }

    @Override
    public void sit() {
        System.out.println("Bench sit");
    }

    @Override
    public void move() {
        System.out.println("Bench move");
    }

    @Override
    public void clean() {
        System.out.println("Bench clean");
    }

    @Override
    public void pack() {
        System.out.println("Box pack");
    }

    @Override
    public void open() {
        System.out.println("Box open");
    }

    @Override
    public void seal() {
        System.out.println("Box seal");
    }


    public static void main(String[] args) {
        Bench bench = new Doll();
        bench.clean();
        bench.move();
        bench.sit();

        Box box = new Doll();
        box.open();
        box.seal();
        box.pack();

        Bed bed = new Doll();
        bed.sleep();
        bed.fold();
        bed.makeBed();

        Basket basket = new Doll();
        basket.carryItems();
        basket.open();
        basket.close();

        Door door = new Doll();
        door.open();
        door.close();
        door.lock();

    }
}
