package com.xworkz.fest.work;

public class Dentist extends Hospital {

    Dentist() {
        super();
        System.out.println("Dentist class");
    }

    public void cleanTeeth() {
        System.out.println("Cleaning patient's teeth");
    }

    public void fillCavities() {
        System.out.println("Filling dental cavities");
    }

    public void extractTooth() {
        System.out.println("Extracting a tooth");
    }

    public void provideBraces() {
        System.out.println("Providing braces treatment");
    }

    public void performRootCanal() {
        System.out.println("Performing a root canal");
    }
}
