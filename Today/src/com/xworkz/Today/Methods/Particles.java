package com.xworkz.Today.Methods;

public class Particles {

    void stars(Space space){

        if(space!=null) {

            space.black();
        }

        else{
            System.out.println("This class have null pointer exception");
        }

        System.out.println("Space have millions of stars");
    }
}
