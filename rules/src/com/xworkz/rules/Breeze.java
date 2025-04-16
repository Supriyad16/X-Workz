package com.xworkz.rules;

public class Breeze implements Fan, File {

    @Override
    public void spin() {
        System.out.println("Rotating the fan blades");
    }

    @Override
    public void switchOn() {
        System.out.println("Speeding up the fan");
    }

    @Override
    public void cleans() {
        System.out.println("Turning off the fan");
    }

    @Override
    public void open() {
        System.out.println("Opening the file");
    }

    @Override
    public void close() {
        System.out.println("Closing the file");
    }

    @Override
    public void read() {
        System.out.println("Saving the file");
    }

    public static void main(String[] args) {
        Fan fan = new Breeze();
        fan.cleans();
        fan.spin();
        fan.switchOn();

        File file = new Breeze();
        file.open();
        file.close();
        file.read();
    }
}
