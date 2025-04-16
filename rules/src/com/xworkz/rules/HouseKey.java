package com.xworkz.rules;

public class HouseKey implements Key {

    @Override
    public void insert() {
        System.out.println("Inserting the house key");
    }

    @Override
    public void turn() {
        System.out.println("Turning the house key");
    }

    @Override
    public void remove() {
        System.out.println("Removing the house key");
    }

    public static void main(String[] args) {
        HouseKey key = new HouseKey();
        key.insert();
        key.turn();
        key.remove();
    }
}
