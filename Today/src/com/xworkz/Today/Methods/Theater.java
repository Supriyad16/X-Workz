package com.xworkz.Today.Methods;

public class Theater {

    void show(Poster poster){

        if(poster!=null) {

            poster.ShowInfo();

        }

        else{
            System.out.println("This class have null pointer exception");
        }

        System.out.println("In theater poster will be displayed");
    }
}
