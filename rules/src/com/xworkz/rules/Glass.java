package com.xworkz.rules;

public interface Glass {

    void fill();

    void drink();

    void empty();

    default void refill(){
        System.out.println("refill the glass");
    }
}
