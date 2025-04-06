package com.xworkz.fest.work;

public class ShelfRunner {

        public static void main(String[] args) {

            Shelf shelf = new Hold();
            shelf.store();
            shelf.madeOf();
            shelf.wood();
            shelf.differentSizes();
            shelf.organization();

            Hold hold = new Hold();
            hold.store();
            hold.madeOf();
            hold.wood();
            hold.differentSizes();
            hold.organization();
        }
    }

