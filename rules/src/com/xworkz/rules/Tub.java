package com.xworkz.rules;

public interface Tub {

    void fill();

    void drain();

    void soak();

    default void bath(){
        System.out.println("bath in tub");
    }
}
