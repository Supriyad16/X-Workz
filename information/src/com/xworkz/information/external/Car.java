package com.xworkz.information.external;

import com.xworkz.information.internal.Engine;

public class Car {

    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
        System.out.println("Arg constructor of Car");
    }

    public void drive() {
        System.out.println("Driving the car...");
        if (this.engine != null) {
            this.engine.start();
        } else {
            System.out.println("Engine is null");
        }
    }
}
