package com.xworkz.Today.Methods;

public class Man {

    void hair(Barber barber){


        if(barber!=null) {
            barber.owner();
        }

        else{
            System.out.println("This class have null pointer exception");
        }

        System.out.println("Barber cuts the hair");
    }
}
