package com.xworkz.external;

import com.xworkz.rules.Comb;

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

    @Override
    public void frizz(){
        System.out.println("comb the frizzy hair");
    }

    public static void main(String[] args) {
        HairComb hairComb = new HairComb();
        hairComb.untangle();
        hairComb.clean();
        hairComb.hold();
        hairComb.frizz();
    }
}
