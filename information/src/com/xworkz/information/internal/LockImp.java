package com.xworkz.information.internal;

public class LockImp implements Lock {

    public LockImp() {
        System.out.println("No-arg constructor of LockImp");
    }

    @Override
    public void secure() {
        System.out.println("Running secure in LockImp");
    }
}
