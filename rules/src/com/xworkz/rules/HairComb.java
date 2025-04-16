package com.xworkz.rules;

public class HairComb implements Comb {

    @Override
    public void untangle() {
        System.out.println("Untangling hair with the hair comb");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the hair comb");
    }

    @Override
    public void hold() {
        System.out.println("Holding the hair comb");
    }

    public static void main(String[] args) {
        HairComb comb = new HairComb();
        comb.untangle();
        comb.clean();
        comb.hold();
    }
}
