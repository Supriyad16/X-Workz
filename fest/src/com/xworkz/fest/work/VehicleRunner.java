package com.xworkz.fest.work;

public class VehicleRunner {

    public static void main(String[] args) {

        Vehicle vehicle = new Car();
        vehicle.start();
        vehicle.stop();
        vehicle.fuel();
        vehicle.moves();
        vehicle.carry();



        Car car = new Car();
        car.accelerate();
        car.brake();
        car.airConditioning();
        car.musicSystem();
        car.sunroof();

    }
}