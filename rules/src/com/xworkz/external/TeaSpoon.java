package com.xworkz.external;

import com.xworkz.rules.Spoon;

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

    @Override
    public void mix(){
        System.out.println("Mix the items");
    }

    public static void main(String[] args) {
        TeaSpoon teaSpoon = new TeaSpoon();
        teaSpoon.stir();
        teaSpoon.scoop();
        teaSpoon.eat();
        teaSpoon.mix();
    }
}
