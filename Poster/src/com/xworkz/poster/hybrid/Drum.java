package com.xworkz.poster.hybrid;

public class Drum extends Bell {
    public void beat() {
        System.out.println("Drum is beaten.");
    }

    public static void main(String[] args) {
        Drum drum = new Drum();
        drum.makeNoise();
        drum.ring();
        drum.beat();

        Flute flute = new Flute();
        flute.makeNoise();
        flute.blow();
    }
}
