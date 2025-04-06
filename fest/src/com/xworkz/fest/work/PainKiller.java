package com.xworkz.fest.work;

public class PainKiller extends Medicine {

    PainKiller() {
        super();
        System.out.println("Painkiller class");
    }

    @Override
    public void cureIllness() {
        System.out.println("PainKiller helps cure Pain in the body.");
    }

    @Override
    public void dosage() {
        System.out.println("PainKiller has a prescribed dosage");
    }

    @Override
    public void sideEffects() {
        System.out.println("PainKiller may have side effects");
    }

    @Override
    public void expiryDate() {
        System.out.println("PainKiller Medicine has an expiry date");
    }

    @Override
    public void taste() {
        System.out.println("PainKiller tastes bitter.");
    }

}

