package com.xworkz.fest.work;

public class Camera extends Photo{

    Camera(){

        super();
        System.out.println("Digital camera");
    }

    @Override
    public void gallery(){

        System.out.println("Camera collects photos");
    }

    @Override
    public void memories(){

        System.out.println("Camera collects memories");
    }

    @Override
    public void phone(){

        System.out.println("phone collects photos through camera");
    }

    @Override
    public void safe(){

        System.out.println("photos are safe when clicked through camera. ");
    }

    @Override
    public void click(){

        System.out.println("Click the photos by camera.");
    }
}
