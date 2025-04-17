package com.xworkz.external;

import com.xworkz.rules.Towel;

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

    @Override
    public void clean(){
        System.out.println("bath towel cleans the body");
    }

    public static void main(String[] args) {
        BathTowel bathTowel = new BathTowel();
        bathTowel.dry();
        bathTowel.wash();
        bathTowel.fold();
        bathTowel.clean();
    }
}
