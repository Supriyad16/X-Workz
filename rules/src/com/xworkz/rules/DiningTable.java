package com.xworkz.rules;

public class DiningTable implements Table {

    @Override
    public void place() {
        System.out.println("Placing dishes on the dining table");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the dining table");
    }

    @Override
    public void move() {
        System.out.println("Moving the dining table");
    }

    public static void main(String[] args) {
        DiningTable table = new DiningTable();
        table.place();
        table.clean();
        table.move();
    }
}
