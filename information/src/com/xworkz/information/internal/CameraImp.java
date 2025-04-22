package com.xworkz.information.internal;

public class CameraImp implements Camera {

    public CameraImp() {
        System.out.println("No-arg constructor of CameraImp");
    }

    @Override
    public void capture() {
        System.out.println("Capturing photo in CameraImp");
    }
}
