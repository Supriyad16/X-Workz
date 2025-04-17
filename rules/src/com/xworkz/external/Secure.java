package com.xworkz.external;

import com.xworkz.rules.Key;
import com.xworkz.rules.Lock;

public class Secure implements Key, Lock {

    @Override
    public void turn() {
        System.out.println("Turning the key to unlock");
    }

    @Override
    public void remove() {
        System.out.println("Opening the lock");
    }

    @Override
    public void insert() {
        System.out.println("Inserting the key into the lock");
    }

    @Override
    public void lock() {
        System.out.println("Locking the door with the lock");
    }

    @Override
    public void test() {
        System.out.println("Securing the door with the lock");
    }

    @Override
    public void unlock() {
        System.out.println("Unlocking the lock");
    }

    public static void main(String[] args) {
        Key key = new Secure();
        key.turn();
        key.remove();
        key.insert();

        Lock lock = new Secure();
        lock.lock();
        lock.test();
        lock.unlock();
    }
}