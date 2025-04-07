package com.xworkz.vacation.internal;

public class Teeth extends Dentist{

    public void cavity(Hospital hospital){

        hospital.admitPatient();

        if (hospital instanceof Dentist){
            Dentist dentist = (Dentist) hospital;
            dentist.admitPatient();
            dentist.treatment();
            dentist.bill();
            dentist.surgery();
            dentist.dischargePatient();
        }
    }
}
