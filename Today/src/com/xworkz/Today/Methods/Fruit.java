package com.xworkz.Today.Methods;

public class Fruit {

    void tasty(Mango mango){

        if(mango!=null) {

            mango.yellow();
        }

        else{
            System.out.println("This class have null pointer exception");
        }
        System.out.println("Mango is in yellow colour");


    }
}
