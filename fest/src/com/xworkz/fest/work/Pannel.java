package com.xworkz.fest.work;

public class Pannel extends Projector {
    Pannel() {
        super();
        System.out.println("Panel is initializing");
    }
    public void touchInput() {

        System.out.println("Panel responding to touch input");
    }
    public void displayMenu() {

        System.out.println("Panel displaying menu options");
    }
    public void adjustVolume() {

        System.out.println("Panel adjusting volume");
    }
    public void changeSource() {

        System.out.println("Panel switching input source");
    }
    public void enableSmartMode() {

        System.out.println("Panel enabling smart mode");
    }
}