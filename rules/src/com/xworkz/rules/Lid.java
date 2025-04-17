package com.xworkz.rules;

public interface Lid {

    void cover();

    void open();

    void seal();

    default void close(){
        System.out.println("close the lid");
    }
}
