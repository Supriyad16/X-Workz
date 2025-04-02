package com.xworkz.fest.work;

public class LockRunner {
    public static void main(String[] args) {


        Lock lock = new Key();
        lock.secure();
        lock.open();
        lock.close();
        lock.rust();
        lock.breakLock();




        Key key = new Key();
        key.insert();
        key.rotate();
        key.duplicate();
        key.lost();
        key.matchLock();
    }
}
