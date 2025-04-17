package com.xworkz.rules;

public interface Comb {

    void untangle();

    void clean();

    void hold();

    default void frizz(){
        System.out.println("Hair is so frizz");
    }
}
