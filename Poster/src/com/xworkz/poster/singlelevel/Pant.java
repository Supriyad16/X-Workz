package com.xworkz.poster.singlelevel;

public class Pant extends Shirt {

    public Pant(String brand, int size) {
        super(brand, size);
    }

    public void match() {
        System.out.println("Matches the pant with the shirt");
    }

    public static void main(String[] args) {
        Pant pant = new Pant("Peter England", 28);
        System.out.println("Brand: " + pant.brand + ", Size: " + pant.size);
        pant.wear();
        pant.match();
    }
}
