package com.xworkz.fest.work;


public class Patient extends Doctor {

    Patient() {
        super();
        System.out.println("Patient is consulting the doctor");
    }

    @Override
    public void diagnose() {
        System.out.println("Diagnosing the patient");
    }

    @Override
    public void prescription() {
        System.out.println("Prescribing medicine");
    }

    @Override
    public void check() {
        System.out.println("Checking vitals");
    }

    @Override
    public void surgery() {
        System.out.println("Performing surgery");
    }

    @Override
    public void medicine() {

        System.out.println("Patient must take medicine.");
    }
}