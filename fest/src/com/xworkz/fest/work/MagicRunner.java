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
        spellBook.castSpell();
        spellBook.castSpell();
        spellBook.summonCreature();
        spellBook.controlElements();
        spellBook.disappear();

    }
}
