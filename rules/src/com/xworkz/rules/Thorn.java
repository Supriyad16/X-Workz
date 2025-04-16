package com.xworkz.rules;

public class Thorn implements Stick, Stone, Table, Tent, Spoon {

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

    @Override
    public void hold() {
        System.out.println("Holding the stick");
    }

    @Override
    public void hit() {
        System.out.println("Hitting with the stick");
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
        System.out.println("Carving with the stone");
    }

    @Override
    public void polish() {
        System.out.println("Polishing the table");
    }

    @Override
    public void place() {
        System.out.println("Placing items on the table");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the table");
    }

    @Override
    public void move() {
        System.out.println("Moving the tent");
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
        Stick stick = new Thorn();
        stick.hold();
        stick.hit();
        stick.breakStick();

        Stone stone = new Thorn();
        stone.throwStone();
        stone.carve();
        stone.polish();

        Table table = new Thorn();
        table.move();
        table.place();
        table.clean();

        Tent tent = new Thorn();
        tent.setUp();
        tent.fold();
        tent.shelter();

        Spoon spoon = new Thorn();
        spoon.stir();
        spoon.scoop();
        spoon.eat();
    }
}
