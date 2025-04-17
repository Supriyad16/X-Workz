package com.xworkz.rules;

public interface Coin {

    void flip();

    void toss();

    void shine();

    default void faces(){
        System.out.println("coin have two faces");
    }
}
