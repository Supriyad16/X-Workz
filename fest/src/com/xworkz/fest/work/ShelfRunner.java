package com.xworkz.fest.work;

public class ShelfRunner {

        public static void main(String[] args) {

            Shelf shelf = new Hold();
            shelf.storeItems();
            shelf.madeOfWoodOrMetal();
            shelf.usedInHomesAndOffices();
            shelf.availableInDifferentSizes();
            shelf.helpsInOrganization();


            Hold hold = new Hold();
            hold.supportsWeight();
            hold.securesItems();
            hold.maintainsBalance();
            hold.dependsOnMaterial();
            hold.ensuresDurability();
        }
    }

