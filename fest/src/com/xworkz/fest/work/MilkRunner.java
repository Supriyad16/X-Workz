package com.xworkz.fest.work;

public class MilkRunner {

    public static void main(String[] args) {

        Milk milk = new White();
        milk.nutritious();
        milk.calcium();
        milk.dairyProducts();
        milk.consume();
        milk.essential();

        White white = new White();
        white.nutritious();
        white.calcium();
        white.dairyProducts();
        white.consume();
        white.essential();
    }
}
