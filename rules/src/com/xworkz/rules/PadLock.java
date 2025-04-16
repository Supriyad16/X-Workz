package com.xworkz.rules;

public class PadLock implements Lock {

    @Override
    public void lock() {
        System.out.println("Locking the padlock");
    }

    @Override
    public void unlock() {
        System.out.println("Unlocking the padlock");
    }

    @Override
    public void test() {
        System.out.println("Testing the padlock");
    }

    public static void main(String[] args) {
        PadLock lock = new PadLock();
        lock.lock();
        lock.unlock();
        lock.test();
    }
}
