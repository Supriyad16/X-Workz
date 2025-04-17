package com.xworkz.rules;

public interface Knife {

    void cut();

    void slice();

    void clean();

    default void wipe(){
        System.out.println("wipe the knife");
    }
}
