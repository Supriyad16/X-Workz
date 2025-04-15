package com.xworkz.poster.multilevel;

public class Plate {

    String type;
    String material;

    public Plate(String type, String material ){
        this.material=material;
        this.type=type;


    }
    public void eat(){
        System.out.println("Eat food using plate");
    }
}
