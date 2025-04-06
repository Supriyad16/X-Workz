package com.xworkz.fest.work;

public class VehicleRunner {

    public static void main(String[] args) {

        Vehicle vehicle = new Car();
        vehicle.accelerate();
        vehicle.brake();
        vehicle.airConditioning();
        vehicle.musicSystem();
        vehicle.sunroof();


        Car car = new Car();
        car.accelerate();
        car.brake();
        car.airConditioning();
        car.musicSystem();
        car.sunroof();

    }
}