package com.xworkz.Today.Methods;

public class Video {

    void tape(Camera camera){

        if(camera!=null) {

            camera.pixel();
        }
        else{
            System.out.println("This class have null pointer exception");
        }

        System.out.println("video stores in tape");
    }
}
