package com.xworkz.external;

import com.xworkz.rules.*;

public class Scanner implements Fork, Frame, Key, Lock, Lamp {

    @Override
    public void poke() {
        System.out.println("Poking with the fork");
    }

    @Override
    public void lift() {
        System.out.println("Lifting the frame");
    }

    @Override
    public void wash() {
        System.out.println("Washing the fork");
    }

    @Override
    public void hang() {
        System.out.println("Hanging the frame");
    }

    @Override
    public void support() {
        System.out.println("Frame supporting the photo");
    }

    @Override
    public void display() {
        System.out.println("Displaying in the frame");
    }

    @Override
    public void insert() {
        System.out.println("Inserting the key into the lock");
    }

    @Override
    public void turn() {
        System.out.println("Turning the key");
    }

    @Override
    public void remove() {
        System.out.println("Removing the key from the lock");
    }

    @Override
    public void switchOn() {
        System.out.println("Switching on the lamp");
    }

    @Override
    public void switchOff() {
        System.out.println("Switching off the lamp");
    }

    @Override
    public void glow() {
        System.out.println("Lamp glowing");
    }

    @Override
    public void lock() {
        System.out.println("Locking the lock");
    }

    @Override
    public void unlock() {
        System.out.println("Unlocking the lock");
    }

    @Override
    public void test() {
        System.out.println("Testing the lock");
    }

    public static void main(String[] args) {
        Fork fork = new Scanner();
        fork.poke();
        fork.wash();
        fork.lift();

        Frame frame = new Scanner();
        frame.hang();
        frame.support();
        frame.display();

        Key key = new Scanner();
        key.insert();
        key.turn();
        key.remove();

        Lock lock = new Scanner();
        lock.lock();
        lock.unlock();
        lock.test();

        Lamp lamp = new Scanner();
        lamp.switchOn();
        lamp.switchOff();
        lamp.glow();
    }
}
