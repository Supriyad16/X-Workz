package com.xworkz.poster.singlelevel;

public class Sweets extends Chocolate {

    public Sweets(String name, String brand) {
        super(name, brand);
    }

    public void addict() {
        System.out.println("Chocolate get addicted by eating a lot");

    }

    public static void main(String[] args) {
        Sweets sweets = new Sweets("Dairy Milk", "Cadbury");
        System.out.println("Name: "+sweets.name +","+ " Brand: "+ sweets.brand);

        sweets.taste();
        sweets.addict();
    }

}

