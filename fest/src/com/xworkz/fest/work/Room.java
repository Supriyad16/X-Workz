package com.xworkz.fest.work;

class Room extends Office {
    Room() {
        super();
        System.out.println("Room class");
    }

    @Override
    public void work() {
        System.out.println("People work in office.");
    }

    @Override
    public void meetings() {
        System.out.println("Meetings are conducted.");
    }

    @Override
    public void computers() {
        System.out.println("Employees use computers.");
    }

    @Override
    public void documents() {
        System.out.println("Printing documents.");
    }

    @Override
    public void breaks() {
        System.out.println("Employees take breaks.");

    }

}