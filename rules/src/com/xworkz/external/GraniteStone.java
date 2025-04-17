package com.xworkz.external;

import com.xworkz.rules.Stone;

public class GraniteStone implements Stone {

    @Override
    public void throwStone() {
        System.out.println("Throwing the granite stone");
    }

    @Override
    public void carve() {
        System.out.println("Carving the granite stone");
    }

    @Override
    public void polish() {
        System.out.println("Polishing the granite stone");
    }

    @Override
    public void build(){
        System.out.println("Granite stones are used in construction");
    }

    public static void main(String[] args) {
        GraniteStone graniteStone = new GraniteStone();
        graniteStone.throwStone();
        graniteStone.carve();
        graniteStone.polish();
        graniteStone.build();
    }
}
