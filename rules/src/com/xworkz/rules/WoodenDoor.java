package com.xworkz.rules;

public class WoodenDoor implements Door {

    @Override
    public void open() {
        System.out.println("Opening the wooden door");
    }

    @Override
    public void close() {
        System.out.println("Closing the wooden door");
    }

    @Override
    public void lock() {
        System.out.println("Locking the wooden door");
    }

    public static void main(String[] args) {
        WoodenDoor door = new WoodenDoor();
        door.open();
        door.close();
        door.lock();
    }
}
