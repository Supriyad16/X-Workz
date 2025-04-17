package com.xworkz.external;

import com.xworkz.rules.Door;

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

    public void wood(){
        System.out.println("wooden door");
    }

    public static void main(String[] args) {
        WoodenDoor woodenDoor = new WoodenDoor();
        woodenDoor.open();
        woodenDoor.close();
        woodenDoor.lock();
        woodenDoor.wood();
    }
}
