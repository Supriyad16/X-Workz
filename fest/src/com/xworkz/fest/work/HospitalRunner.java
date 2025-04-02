package com.xworkz.fest.work;

public class HospitalRunner {
    public static void main(String[] args) {

        Hospital hospital = new Dentist();
        hospital.admitPatient();
        hospital.provideTreatment();
        hospital.performSurgery();
        hospital.generateBill();
        hospital.dischargePatient();



        Dentist dentist = new Dentist();
        dentist.cleanTeeth();
        dentist.fillCavities();
        dentist.extractTooth();
        dentist.provideBraces();
        dentist.performRootCanal();
    }
}
