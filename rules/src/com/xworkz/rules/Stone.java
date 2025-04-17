package com.xworkz.rules;

public interface Stone {

    void throwStone();

    void carve();

    void polish();

    default void build(){
        System.out.println("build using stones");
    }
}
