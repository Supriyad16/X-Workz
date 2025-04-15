package com.xworkz.poster.multilevel;

public class Laptop extends Tab {

    public Laptop(String brand, String model) {
        super(brand, model);
    }

    public void code() {
        System.out.println("Coding using laptop");
    }

    public static void main(String[] args) {
        Laptop laptop = new Laptop("Apple", "MacBook Pro");
        System.out.println("Brand: " + laptop.brand + ","+" Model: " + laptop.model);
        laptop.call();
        laptop.draw();
        laptop.code();
    }
}
