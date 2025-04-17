package com.xworkz.rules;

public interface Lock {

    void lock();

    void unlock();

    void test();

    default void safety(){
        System.out.println("Lock give safety");
    }
}
