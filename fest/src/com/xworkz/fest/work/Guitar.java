package com.xworkz.fest.work;

public class Guitar extends Music {


    Guitar() {
        super();
        System.out.println("Guitar is a string instrument");
    }

    @Override
    public void play() {

        System.out.println("Guitar plays music");
    }

    @Override
    public void stop() {

        System.out.println("Stop the music");
    }

    @Override
    public void pause() {

        System.out.println("Pause the music");
    }

    @Override
    public void volume() {

        System.out.println("Adjust the volume");
    }

    @Override
    public void instrument() {

        System.out.println("Tuning the strings.");
    }
}