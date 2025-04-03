package com.xworkz.fest.work;

class Pen extends Notebook {
    Pen() {
        super();
        System.out.println("Pen class");
    }

    public void write() {
        System.out.println("Writing with the pen.");
    }

    public void refillInk() {
        System.out.println("Refilling the pen with ink.");
    }

    public void draw() {
        System.out.println("Drawing with the pen.");
    }

    public void changeColor() {
        System.out.println("Changing the pen color.");
    }

    public void capPen() {
        System.out.println("Putting the cap on the pen.");
    }
}