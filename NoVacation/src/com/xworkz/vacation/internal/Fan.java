package com.xworkz.vacation.internal;

class Fan extends Air {
    Fan() {
        super();
        System.out.println("Fan class");
    }

    @Override
    public void flow() {
        System.out.println("Fan flows air");
    }

    @Override
    public void carryOxygen() {
        System.out.println("Carrying oxygen through the air for respiration.");
    }

    @Override
    public void changeTemperature() {
        System.out.println("Changing temperature as air heats up or cools down.");
    }

    @Override
    public void spreadSmell() {
        System.out.println("Spreading smells and scents through the air.");
    }

    @Override
    public void createWind() {
        System.out.println("Creating wind through the movement of air.");
    }

    public void cool(){
        System.out.println("Cool the place.");
    }
}