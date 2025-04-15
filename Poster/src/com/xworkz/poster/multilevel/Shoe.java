package com.xworkz.poster.multilevel;

public class Shoe {

    String brand;
    int size;

    public Shoe(String brand, int size) {
        this.brand = brand;
        this.size = size;
    }

    public void wear() {
        System.out.println("Wearing the shoe");
    }

    public void run() {
        System.out.println("Running with the shoe");
    }
}
