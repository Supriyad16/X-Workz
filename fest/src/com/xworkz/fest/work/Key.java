package com.xworkz.fest.work;

public class Key extends Lock {

    Key() {
        super();
        System.out.println("A key is used to unlock a lock!");
    }

    public void insert() {
        System.out.println("The key is inserted into the lock...");
    }

    public void rotate() {
        System.out.println("The key is rotated to unlock...");
    }

    public void duplicate() {
        System.out.println("Keys can be duplicated...");
    }

    public void lost() {
        System.out.println("If a key is lost, the lock remains locked...");
    }

    public void matchLock() {
        System.out.println("The key must match the lock to work...");
    }
}
