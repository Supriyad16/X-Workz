package com.xworkz.fest.work;

public class WoodRunner {
    public static void main(String[] args) {


        Wood wood = new Cupboard();
        wood.strongMaterial();
        wood.usedForFurniture();
        wood.comesInDifferentTypes();
        wood.naturalResource();
        wood.canBePolished();


        Cupboard cupboard = new Cupboard();
        cupboard.usedForStorage();
        cupboard.availableInVariousSizes();
        cupboard.canHaveLocks();
        cupboard.comesWithShelves();
        cupboard.enhancesInterior();
    }
}
