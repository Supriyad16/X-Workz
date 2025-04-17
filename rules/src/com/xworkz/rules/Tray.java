package com.xworkz.rules;

public interface Tray {

    void serve();

    void holdItems();

    void clean();

    default void arrange(){
        System.out.println("arrange items in tray ");
    }
}
