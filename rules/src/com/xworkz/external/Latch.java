package com.xworkz.external;

import com.xworkz.rules.Door;
import com.xworkz.rules.Drum;

public class Latch implements Door, Drum {

    @Override
    public void open() {
        System.out.println("Opening the door");
    }

    @Override
    public void close() {
        System.out.println("Closing the door");
    }

    @Override
    public void lock() {
        System.out.println("Locking the door");
    }

    @Override
    public void beat() {
        System.out.println("Beating the drum");
    }

    @Override
    public void carry() {
        System.out.println("Playing the drum");
    }

    @Override
    public void tune() {
        System.out.println("The drum makes sound");
    }

    public static void main(String[] args) {
        Door door = new Latch();
        door.open();
        door.close();
        door.lock();

        Drum drum = new Latch();
        drum.beat();
        drum.carry();
        drum.tune();
    }
}
