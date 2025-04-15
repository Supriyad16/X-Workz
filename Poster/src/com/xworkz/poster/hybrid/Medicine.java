package com.xworkz.poster.hybrid;

public class Medicine extends Syrup {
    public void use() {
        System.out.println("Using medicine...");
    }

    public static void main(String[] args) {
        Medicine med = new Medicine();
        med.consume();
        med.drink();
        med.use();

        Cream cream = new Cream();
        cream.consume();
        cream.apply();
    }
}
