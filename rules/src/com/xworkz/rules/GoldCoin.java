package com.xworkz.rules;

public class GoldCoin implements Coin {

    @Override
    public void flip() {
        System.out.println("Flipping the gold coin");
    }

    @Override
    public void toss() {
        System.out.println("Tossing the gold coin");
    }

    @Override
    public void shine() {
        System.out.println("Shining the gold coin");
    }

    public static void main(String[] args) {
        GoldCoin coin = new GoldCoin();
        coin.flip();
        coin.toss();
        coin.shine();
    }
}
