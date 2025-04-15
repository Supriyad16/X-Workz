package com.xworkz.poster.singlelevel;

public class Bottle {
    String brand;
    String material;

    public Bottle(String brand, String material){
            this.brand=brand;
            this.material=material;
    }

    public void drink(){
        System.out.println("Drink the water");
    }
}
