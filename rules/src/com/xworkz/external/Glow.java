package com.xworkz.external;

import com.xworkz.rules.*;

public class Glow implements Stick, Stone, Table, Tap, Tent {

    @Override
    public void hold() {
        System.out.println("Holding the stick");
    }

    @Override
    public void hit() {
        System.out.println("Hitting the stick");
    }

    @Override
    public void breakStick() {
        System.out.println("Breaking the stick");
    }

    @Override
    public void throwStone() {
        System.out.println("Throwing the stone");
    }

    @Override
    public void carve() {
        System.out.println("Carving the stone");
    }

    @Override
    public void polish() {
        System.out.println("Polishing the stone");
    }

    @Override
    public void place() {
        System.out.println("Placing the stone on the table");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the table");
    }

    @Override
    public void move() {
        System.out.println("Moving the table");
    }

    @Override
    public void open() {
        System.out.println("Opening the tap");
    }

    @Override
    public void close() {
        System.out.println("Closing the tap");
    }

    @Override
    public void leak() {
        System.out.println("Tap is leaking");
    }

    @Override
    public void setUp() {
        System.out.println("Setting up the tent");
    }

    @Override
    public void fold() {
        System.out.println("Folding the tent");
    }

    @Override
    public void shelter() {
        System.out.println("Providing shelter with the tent");
    }

    public static void main(String[] args) {
        Stick stick = new Glow();
        stick.hold();
        stick.hit();
        stick.breakStick();

        Stone stone = new Glow();
        stone.throwStone();
        stone.carve();
        stone.polish();


        Table table = new Glow();
        table.clean();
        table.move();
        table.place();

        Tap tap = new Glow();
        tap.open();
        tap.close();
        tap.leak();

        Tent tent = new Glow();
        tent.setUp();
        tent.fold();
        tent.shelter();
    }
}
