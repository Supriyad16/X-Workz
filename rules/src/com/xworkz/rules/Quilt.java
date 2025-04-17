package com.xworkz.rules;

public interface Quilt {

    void cover();

    void warm();

    void clean();

    default void winter(){
        System.out.println("Quilt is used in winter");
    }
}
