package com.xworkz.rules;

public interface Pencil {

    void wrote();

    void sharpen();

    void breakTip();

    default void lead(){
        System.out.println("pencil has lead");
    }
}
