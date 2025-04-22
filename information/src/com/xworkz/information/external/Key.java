package com.xworkz.information.external;

import com.xworkz.information.internal.Lock;

public class Key {

    private Lock lock;

    public Key(Lock lock) {
        this.lock = lock;
        System.out.println("Arg constructor of Key");
    }

    public void unlock() {
        System.out.println("unlock in Key");
        if (this.lock != null) {
            this.lock.secure();
        } else {
            System.out.println("Lock is null");
        }
    }
}
