package com.xworkz.rules;

public class BathTowel implements Towel {

    @Override
    public void dry() {
        System.out.println("Drying body with the bath towel");
    }

    @Override
    public void wash() {
        System.out.println("Washing the bath towel");
    }

    @Override
    public void fold() {
        System.out.println("Folding the bath towel");
    }

    public static void main(String[] args) {
        BathTowel towel = new BathTowel();
        towel.dry();
        towel.wash();
        towel.fold();
    }
}
