package com.xworkz.rules;

public interface Mug {

    void fill();

    void sip();

    void wash();

    default void drink(){
        System.out.println("drink using mug");
    }
}
