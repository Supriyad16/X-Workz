package com.xworkz.rules;

public class PickleJar implements Jar {

    @Override
    public void open() {
        System.out.println("Opening the pickle jar");
    }

    @Override
    public void store() {
        System.out.println("Storing pickles in the jar");
    }

    @Override
    public void close() {
        System.out.println("Closing the pickle jar");
    }

    public static void main(String[] args) {
        PickleJar jar = new PickleJar();
        jar.open();
        jar.store();
        jar.close();
    }
}
