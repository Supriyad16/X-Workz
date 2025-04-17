package com.xworkz.rules;

public interface Phone {

    void call();

    void text();

    void browse();

    default void scroll(){
        System.out.println("Scroll through social media");
    }
}
