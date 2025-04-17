package com.xworkz.external;

import com.xworkz.rules.Bowl;

public class GlassBowl implements Bowl {

    @Override
    public void holdFood() {
        System.out.println("Holding food in the glass bowl");
    }

    @Override
    public void wash() {
        System.out.println("Washing the glass bowl");
    }

    @Override
    public void cover() {
        System.out.println("Covering the glass bowl");
    }

    @Override
    public void store(){
        System.out.println("Store the food");
    }

    public static void main(String[] args) {
        GlassBowl glassBowl = new GlassBowl();
        glassBowl.holdFood();
        glassBowl.wash();
        glassBowl.cover();
        glassBowl.store();
    }
}
