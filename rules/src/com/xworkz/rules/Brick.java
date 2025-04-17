package com.xworkz.rules;

public interface Brick {

    void build();

    void breakBrick();

    void weigh();

    default void strength (){
        System.out.println("The strength of the brick");
    }
}
