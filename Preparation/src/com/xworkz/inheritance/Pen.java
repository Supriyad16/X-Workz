package com.xworkz.inheritance;

public class Pen {

    String type;
    String brand;
    int cost;

    public Pen(){
        System.out.println("asdfghjk");
    }

    public Pen(String type){
        this.type=type;
        System.out.println(type);
    }

    public Pen(String type, String brand){
        this(type);
        this.brand=brand;
        System.out.println(brand);

    }

    public  Pen (String type, String brand, int cost){
        this(type,brand);
        this.cost=cost;
        System.out.println(cost);
    }

    public static void main(String[] args) {
        Pen pen = new Pen("Ball", "Doms", 5);
        System.out.println(pen);
    }
}
