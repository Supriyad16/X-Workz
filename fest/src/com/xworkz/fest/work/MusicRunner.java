package com.xworkz.fest.work;

public class MusicRunner {

    public static void main(String[] args) {

        Music music = new Guitar();
        music.instrument();
        music.pause();
        music.play();
        music.stop();
        music.volume();

        Guitar guitar = new Guitar();
        guitar.chord();
        guitar.sound();
        guitar.pluck();
        guitar.strum();
        guitar.strings();

    }
}
