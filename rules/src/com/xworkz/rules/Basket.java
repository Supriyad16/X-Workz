package com.xworkz.rules;

public interface Basket {

    void open();

    void close();

    void carryItems();

    default void hold(){
        System.out.println("Hold the items");
    }
}
