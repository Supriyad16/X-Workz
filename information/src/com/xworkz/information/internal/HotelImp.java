package com.xworkz.information.internal;

public class HotelImp implements Hotel {

    public HotelImp() {
        System.out.println("No-arg constructor of HotelImp");
    }

    @Override
    public void serve() {
        System.out.println("Running serve in HotelImp");
    }
}
