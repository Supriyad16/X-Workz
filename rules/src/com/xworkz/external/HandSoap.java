package com.xworkz.external;

import com.xworkz.rules.Soap;

public class HandSoap implements Soap {

    @Override
    public void lather() {
        System.out.println("Lathering the hand soap");
    }

    @Override
    public void wash() {
        System.out.println("Washing hands with the hand soap");
    }

    @Override
    public void dry() {
        System.out.println("Drying hands after washing with hand soap");
    }

    @Override
    public void clean(){
        System.out.println("clean  hand using soap");
    }

    public static void main(String[] args) {
        HandSoap handSoap = new HandSoap();
        handSoap.lather();
        handSoap.wash();
        handSoap.dry();
        handSoap.clean();
    }
}
