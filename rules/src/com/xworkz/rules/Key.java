package com.xworkz.rules;

public interface Key {

    void insert();

    void turn();

    void remove();

    default void twist(){
        System.out.println("twist the key");
    }
}
