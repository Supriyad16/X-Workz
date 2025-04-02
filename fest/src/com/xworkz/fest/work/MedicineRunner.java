package com.xworkz.fest.work;


public class MedicineRunner {
    public static void main(String[] args) {

        Medicine medicine = new PainKiller();
        medicine.cureIllness();
        medicine.dosage();
        medicine.sideEffects();
        medicine.expiryDate();
        medicine.storageConditions();



        PainKiller painkiller = new PainKiller();
        painkiller.relievePain();
        painkiller.quickAction();
        painkiller.overTheCounter();
        painkiller.differentStrengths();
        painkiller.suitableForHeadache();
    }
}
