package com.xworkz.rules;

public interface Nail {

    void hammer();

    void pull();

    void rust();

    default void hit(){
        System.out.println("hit the nail");
    }
}
