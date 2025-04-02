package com.xworkz.fest.work;

public class MagicRunner {
    public static void main(String[] args) {

        Magic magic = new SpellBook();
        magic.castSpell();
        magic.createIllusion();
        magic.summonCreature();
        magic.controlElements();
        magic.disappear();



        SpellBook spellBook = new SpellBook();
        spellBook.readSpell();
        spellBook.storeMagic();
        spellBook.unlockSecret();
        spellBook.createPotion();
        spellBook.enhancePower();
    }
}
