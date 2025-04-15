package com.xworkz.poster.singlelevel;

public class Shirt {
    String brand;
    int size;

    public Shirt(String brand, int size) {
        this.brand = brand;
        this.size = size;
    }

    public void wear() {
        System.out.println("Wearing a branded shirt");
    }
}
