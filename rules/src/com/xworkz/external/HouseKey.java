package com.xworkz.external;

import com.xworkz.rules.Key;

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

    @Override
    public void twist(){
        System.out.println("key twists");
    }

    public static void main(String[] args) {
        HouseKey houseKey = new HouseKey();
        houseKey.insert();
        houseKey.turn();
        houseKey.remove();
        houseKey.twist();
    }
}
