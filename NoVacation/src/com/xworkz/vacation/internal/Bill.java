package com.xworkz.vacation.internal;

public class Bill extends Patient{

    public void paid(Doctor doctor) {

        doctor.medicine();

        if(doctor instanceof Patient){

            Patient patient = (Patient) doctor;
            patient.check();
            patient.diagnose();
            patient.drips();
            patient.medicine();
            patient.prescription();
            patient.surgery();
        }

    }
}
