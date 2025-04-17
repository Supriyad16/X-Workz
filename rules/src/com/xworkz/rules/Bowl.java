package com.xworkz.rules;

public interface Bowl {

    void holdFood();

    void wash();

    void cover();

    default void store(){
        System.out.println("Store food in bowl");
    }
}
