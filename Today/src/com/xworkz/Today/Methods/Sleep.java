package com.xworkz.Today.Methods;

public class Sleep {

    void peace(Pillow pillow){

        if(pillow!=null){

            pillow.soft();
        }

        else{

            System.out.println("This class have null pointer exception");
        }

        System.out.println("Pillow gives good sleep");
    }
}


