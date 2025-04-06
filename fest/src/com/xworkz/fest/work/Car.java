package com.xworkz.fest.work;

    public class Car extends Vehicle {

        Car() {
            super();
            System.out.println("Car class");
        }

        @Override
        public void accelerate() {
            System.out.println("Car is accelerating");
        }

        @Override
        public void brake() {
            System.out.println("Car is braking");
        }

        @Override
        public void airConditioning() {
            System.out.println("Car has air conditioning");
        }

        @Override
        public void musicSystem() {
            System.out.println("Car has a music system");
        }

        @Override
        public void sunroof() {
            System.out.println("Car has a sunroof");
        }
    }



