package com.xworkz.fest.work;

public class SpellBook extends Magic {

    SpellBook() {
        super();
        System.out.println("Opening the ancient spell book.");
    }

    @Override
    public void castSpell() {
        System.out.println("Cast a spell.");
    }

    @Override
    public void disappear() {
        System.out.println("Disappear in thin air.");
    }

    @Override
    public void createIllusion() {
        System.out.println("Create an illusion.");
    }

    @Override
    public void summonCreature() {
        System.out.println("Summon a magical creature.");
    }

    @Override
    public void controlElements() {
        System.out.println("Control the elements.");
    }
}
