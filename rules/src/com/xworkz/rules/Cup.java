package com.xworkz.rules;

public interface Cup {

    void pour();

    void drink();

    void wash();

    default void material(){
        System.out.println("cup is made od material");
    }
}
