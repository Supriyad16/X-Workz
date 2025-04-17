package com.xworkz.rules;

public interface Rug {

    void lay();

    void clean();

    void roll();

    default void cover(){
        System.out.println("cover the rug");
    }
}
