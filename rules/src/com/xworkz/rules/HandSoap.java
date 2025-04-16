package com.xworkz.rules;

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

    public static void main(String[] args) {
        HandSoap soap = new HandSoap();
        soap.lather();
        soap.wash();
        soap.dry();
    }
}
