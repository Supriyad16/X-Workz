package com.xworkz.rules;

public interface Paper {

    void write();

    void tear();

    void fold();

    default void craft(){
        System.out.println("do crafts using paper");
    }
}
