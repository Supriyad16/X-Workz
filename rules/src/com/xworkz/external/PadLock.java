package com.xworkz.external;

import com.xworkz.rules.Lock;

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

    @Override
    public void safety(){
        System.out.println("padlock give safety");
    }

    public static void main(String[] args) {
        PadLock padLock = new PadLock();
        padLock.lock();
        padLock.unlock();
        padLock.test();
        padLock.safety();
    }
}
