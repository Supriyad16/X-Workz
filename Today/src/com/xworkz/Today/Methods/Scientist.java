package com.xworkz.Today.Methods;

public class Scientist {

    void Isro(Rocket rocket){

        if(rocket!=null) {

            rocket.big();
        }

        else{
            System.out.println("This class have null pointer exception");
        }

        System.out.println("ISRO Scientists have created Rocket");

    }
}
