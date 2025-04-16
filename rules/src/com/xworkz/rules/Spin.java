package com.xworkz.rules;

public class Spin implements Coin, Comb {

    @Override
    public void flip() {
        System.out.println("Flipping the coin");
    }

    @Override
    public void toss() {
        System.out.println("Tossing the coin");
    }

    @Override
    public void shine() {
        System.out.println("Spinning the coin");
    }

    @Override
    public void hold() {
        System.out.println("Combing the hair with the comb");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the comb");
    }

    @Override
    public void untangle() {
        System.out.println("Styling the hair with the comb");
    }

    public static void main(String[] args) {
        Coin coin = new Spin();
        coin.flip();
        coin.toss();
        coin.shine();

        Comb comb = new Spin();
        comb.hold();
        comb.clean();
        comb.untangle();
    }
}
