package com.xworkz.fest.work;

public class ToysRunner {
    public static void main(String[] args) {


        Toys toys = new Dolls();
        toys.provideEntertainment();
        toys.madeOfDifferentMaterials();
        toys.availableInVariousTypes();
        toys.improveCreativity();
        toys.usedForLearning();

        Dolls dolls = new Dolls();
        dolls.dressedInDifferentStyles();
        dolls.popularAmongChildren();
        dolls.availableInVariousSizes();
        dolls.usedForRolePlaying();
        dolls.collectibleItems();
    }
}
