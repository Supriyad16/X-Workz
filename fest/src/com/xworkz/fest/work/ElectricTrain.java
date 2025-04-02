package com.xworkz.fest.work;

public class ElectricTrain extends Electricity {

    ElectricTrain() {
        super();
        System.out.println("An electric train runs on tracks, powered by electricity!");
    }

    public void startJourney() {
        System.out.println("The electric train is starting its journey...");
    }

    public void increaseSpeed() {
        System.out.println("The electric train is increasing its speed...");
    }

    public void honk() {
        System.out.println("Electric train is honking loudly: Beep Beep!");
    }

    public void stop() {
        System.out.println("Electric train is slowing down and coming to a stop...");
    }

    public void transportPeople() {
        System.out.println("Electric train is transporting passengers efficiently...");
    }
}
