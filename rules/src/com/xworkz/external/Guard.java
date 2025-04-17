package com.xworkz.external;

import com.xworkz.rules.*;

public class Guard implements Drum, Coin, Comb, Clip, Clock {

    @Override
    public void release() {
        System.out.println("Clip released");
    }

    @Override
    public void open() {
        System.out.println("Clip opened");
    }

    @Override
    public void showTime() {
        System.out.println("Clock showing time");
    }

    @Override
    public void tick() {
        System.out.println("Clock ticking");
    }

    @Override
    public void alarm() {
        System.out.println("Clock alarm ringing");
    }

    @Override
    public void flip() {
        System.out.println("Coin flipped");
    }

    @Override
    public void toss() {
        System.out.println("Coin tossed");
    }

    @Override
    public void shine() {
        System.out.println("Coin shining");
    }

    @Override
    public void untangle() {
        System.out.println("Comb untangling hair");
    }

    @Override
    public void clean() {
        System.out.println("Comb cleaning hair");
    }

    @Override
    public void hold() {
        System.out.println("Comb held in hand");
    }

    @Override
    public void beat() {
        System.out.println("Drum beating");
    }

    @Override
    public void carry() {
        System.out.println("Drum being carried");
    }

    @Override
    public void tune() {
        System.out.println("Drum being tuned");
    }

    public static void main(String[] args) {
        Drum drum = new Guard();
        drum.beat();
        drum.carry();
        drum.tune();

        Coin coin = new Guard();
        coin.flip();
        coin.toss();
        coin.shine();

        Comb comb = new Guard();
        comb.untangle();
        comb.clean();
        comb.hold();

        Clip clip = new Guard();
        clip.release();
        clip.open();

        Clock clock = new Guard();
        clock.showTime();
        clock.tick();
        clock.alarm();
    }
}
