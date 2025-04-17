package com.xworkz.rules;

public interface Shoe {

    void wear();

    void clean();

    void tie();

    default void run(){
        System.out.println("running shoes");
    }
}
