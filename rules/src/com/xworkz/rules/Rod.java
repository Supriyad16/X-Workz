package com.xworkz.rules;

public interface Rod {

    void hold();

    void bend();

    void extend();

    default void support(){
        System.out.println("gives support");
    }


}
