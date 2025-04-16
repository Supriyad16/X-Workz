package com.xworkz.rules;

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

    public static void main(String[] args) {
        GlassBowl bowl = new GlassBowl();
        bowl.holdFood();
        bowl.wash();
        bowl.cover();
    }
}
