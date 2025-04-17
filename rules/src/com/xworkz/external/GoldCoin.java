package com.xworkz.external;

import com.xworkz.rules.Coin;

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

    @Override
    public void faces(){
        System.out.println("Gold coin have 2 faces");
    }

    public static void main(String[] args) {
        GoldCoin goldCoin = new GoldCoin();
        goldCoin.flip();
        goldCoin.toss();
        goldCoin.shine();
        goldCoin.faces();
    }
}
