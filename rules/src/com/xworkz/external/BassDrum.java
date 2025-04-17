package com.xworkz.external;

import com.xworkz.rules.Drum;

public class BassDrum implements Drum {

    @Override
    public void beat() {
        System.out.println("Beating the bass drum");
    }

    @Override
    public void carry() {
        System.out.println("Carrying the bass drum");
    }

    @Override
    public void tune() {
        System.out.println("Tuning the bass drum");
    }

    @Override
    public void sound(){
        System.out.println("bass drum sound");
    }

    public static void main(String[] args) {
        BassDrum bassDrum = new BassDrum();
        bassDrum.beat();
        bassDrum.carry();
        bassDrum.tune();
        bassDrum.sound();
    }
}