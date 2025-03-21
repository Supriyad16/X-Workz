package com.xworkz.Today.Methods;

public class Shop {
    void run(Display display){

        System.out.println("This is shop class");

       if (display != null) {
            System.out.println("This class has not null pointer exception");
             display.ads();
        }
        else {
            System.out.println("This class have null pointer exception");
        }

    }
}
