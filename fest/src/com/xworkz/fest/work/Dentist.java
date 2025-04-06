package com.xworkz.fest.work;

public class Dentist extends Hospital {

    Dentist() {
        super();
        System.out.println("Dentist class");
    }

    @Override
    public void admitPatient() {
        System.out.println("Admits the  patient.");
    }

    @Override
    public void treatment() {
        System.out.println("Provides the treatment.");
    }

    @Override
    public void surgery() {
        System.out.println("Performs the  surgery");
    }

    @Override
    public void bill() {
        System.out.println("Gives bill to the patient.");
    }

    @Override
    public void dischargePatient() {
        System.out.println("Discharges the patient.");
    }
}
