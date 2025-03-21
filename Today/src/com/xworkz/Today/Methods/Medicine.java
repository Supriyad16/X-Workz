package com.xworkz.Today.Methods;

public class Medicine {

    void health(Dolo650 dolo650){

        if(dolo650!=null) {

            dolo650.tablet();
        }

        else{
            System.out.println("This class have null pointer exception");
        }

        System.out.println("Medicine helps to maintain health");
    }
}
