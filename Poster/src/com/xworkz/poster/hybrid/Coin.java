package com.xworkz.poster.hybrid;

public class Coin extends Silver {
    public void toss() {
        System.out.println("Coin is tossed.");
    }

    public static void main(String[] args) {
        Coin coin = new Coin();
        coin.shine();
        coin.value();
        coin.toss();

        Copper copper = new Copper();
        copper.shine();
        copper.conduct();
    }
}
