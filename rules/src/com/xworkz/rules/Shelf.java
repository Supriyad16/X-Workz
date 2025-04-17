package com.xworkz.rules;

public interface Shelf {

    void hold();

    void organize();

    void clean();

    default void arrange(){
        System.out.println("arrange the items");
    }
}
