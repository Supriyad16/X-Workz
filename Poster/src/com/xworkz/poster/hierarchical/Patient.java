package com.xworkz.poster.hierarchical;

public class Patient extends Hospital {

    void checkup() {
        System.out.println("Patient is getting a checkup");
    }

    public static void main(String[] args) {
        Patient patient = new Patient();
        patient.serve();
        patient.treat();
        patient.checkup();
    }
}
