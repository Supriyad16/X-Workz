package com.xworkz.information.runner;

import com.xworkz.information.internal.Engine;
import com.xworkz.information.internal.EngineImp;
import com.xworkz.information.external.Car;

public class EngineRunner {

    public static void main(String[] args) {
        Engine engine = new EngineImp();
        Car car = new Car(engine);
        car.drive();
    }
}
