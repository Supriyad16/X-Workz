package com.xworkz.fest.work;

public class HospitalRunner {
    public static void main(String[] args) {

        Hospital hospital = new Dentist();
        hospital.admitPatient();
        hospital.treatment();
        hospital.surgery();
        hospital.bill();
        hospital.dischargePatient();



        Dentist dentist = new Dentist();
        dentist.admitPatient();
        dentist.treatment();
        dentist.bill();
        dentist.surgery();
        dentist.dischargePatient();
    }
}
