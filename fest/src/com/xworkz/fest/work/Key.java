package com.xworkz.fest.work;

public class Key extends Lock {

        Key() {
        super();
        System.out.println("A key is used to unlock a lock!");
    }

    @Override
    public void secure() {
        System.out.println("The lock the doors.");
    }

    @Override
    public void open() {
        System.out.println("The lock opens with key.");
    }

    @Override
    public void close() {
        System.out.println("Close the lock");
    }

    @Override
    public void rust() {
        System.out.println("Locks get rusted.");
    }

    @Override
    public void breakLock() {
        System.out.println("Break the lock if key is lost.");
    }
}
