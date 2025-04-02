package com.xworkz;

public class Table {

    private String type = "wood";
    private int cost = 2500;

    Table(String material, int cost){
        this.type = material;
        this.cost = cost;
    }

    public void info(){
        System.out.println("Class table" + this.type);
        System.out.println("Class table" + this.cost);
    }
}
