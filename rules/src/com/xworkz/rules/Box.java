package com.xworkz.rules;

public interface Box {

    void pack();

    void open();

    void seal();

    default void closed(){
        System.out.println("close the box");
    }
}
