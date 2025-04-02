package com.xworkz.fest.work;

public class DoctorRunner {

    public static void main(String[] args) {

        Doctor doctor = new Doctor();
        doctor.prescription();
        doctor.surgery();
        doctor.check();
        doctor.diagnose();
        doctor.medicine();

        Patient patient = new Patient();

        patient.disease();
        patient.rest();
        patient.takeMedicine();
        patient.treatment();
        patient.visitHospital();
    }
}



