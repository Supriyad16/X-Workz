package com.xworkz.rules;

public interface Mask {

    void wear();

    void protect();

    void dispose();

    default void doctor(){
        System.out.println("doctor wear mask");
    }
}
