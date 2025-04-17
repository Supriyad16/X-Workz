package com.xworkz.external;

import com.xworkz.rules.Tap;

public class WaterTap implements Tap {

    @Override
    public void open() {
        System.out.println("Opening the water tap");
    }

    @Override
    public void close() {
        System.out.println("Closing the water tap");
    }

    @Override
    public void leak() {
        System.out.println("The water tap is leaking");
    }

    @Override
    public void flow(){
        System.out.println("Water comes in tap");
    }

    public static void main(String[] args) {
        WaterTap waterTap = new WaterTap();
        waterTap.open();
        waterTap.close();
        waterTap.leak();
        waterTap.flow();
    }
}
