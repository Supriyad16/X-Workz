package com.xworkz.vacation.internal;

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

        Teeth teeth = new Teeth();
        teeth.admitPatient();
        teeth.treatment();
        teeth.bill();
        teeth.surgery();
        teeth.dischargePatient();
    }
}
