package com.xworkz.poster.singlelevel;

public class Thread extends Kite {

    public Thread(String color, String shape) {
        super(color, shape);
    }

    public void hold() {
        System.out.println("Thread is holds the kite");
    }

    public static void main(String[] args) {
        Thread thread = new Thread("Green", "Diamond");
        System.out.println("Color: " + thread.color + ","+" Shape: " + thread.shape);
        thread.fly();
        thread.hold();
    }
}
