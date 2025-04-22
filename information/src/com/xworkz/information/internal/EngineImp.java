package com.xworkz.information.internal;

public class EngineImp implements Engine {

    public EngineImp() {
        System.out.println("No-arg constructor of EngineImp");
    }

    @Override
    public void start() {
        System.out.println("Engine started in EngineImp");
    }
}
