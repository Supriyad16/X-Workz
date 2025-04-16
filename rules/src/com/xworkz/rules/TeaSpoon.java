package com.xworkz.rules;

public class TeaSpoon implements Spoon {

    @Override
    public void stir() {
        System.out.println("Stirring tea with the teaspoon");
    }

    @Override
    public void scoop() {
        System.out.println("Scooping sugar with the teaspoon");
    }

    @Override
    public void eat() {
        System.out.println("Cleaning the teaspoon");
    }

    public static void main(String[] args) {
        TeaSpoon spoon = new TeaSpoon();
        spoon.stir();
        spoon.scoop();
        spoon.eat();
    }
}
