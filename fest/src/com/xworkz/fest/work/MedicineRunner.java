package com.xworkz.fest.work;

public class MedicineRunner {
    public static void main(String[] args) {

        Medicine medicine = new PainKiller();
        medicine.cureIllness();
        medicine.dosage();
        medicine.sideEffects();
        medicine.expiryDate();
        medicine.taste();

        PainKiller painkiller = new PainKiller();
        painkiller.cureIllness();
        painkiller.dosage();
        painkiller.sideEffects();
        painkiller.expiryDate();
        painkiller.taste();
    }

}
