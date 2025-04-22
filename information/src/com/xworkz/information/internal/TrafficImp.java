package com.xworkz.information.internal;

public class TrafficImp implements Traffic {

    public TrafficImp() {
        System.out.println("No-arg constructor of TrafficImp");
    }

    @Override
    public void follow() {
        System.out.println("Running follow in TrafficImp");
    }
}
