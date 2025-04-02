package com.xworkz.fest.work;


public class Patient extends Doctor {

    Patient() {
        super();
        System.out.println("Patient is consulting the doctor");
    }
    public void disease() {

        System.out.println("Patient describes symptoms");
    }
    public void rest() {

        System.out.println("Patient takes prescribed medicine");
    }
    public void treatment() {

        System.out.println("Patient follows doctor's instructions");
    }
    public void takeMedicine() {

        System.out.println("Patient is resting as advised");
    }
    public void visitHospital() {

        System.out.println("Patient attends follow-up appointment");
    }
}