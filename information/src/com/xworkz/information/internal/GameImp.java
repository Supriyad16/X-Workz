package com.xworkz.information.internal;

public class GameImp implements Game {

    public GameImp() {
        System.out.println("No-arg constructor of GameImp");
    }

    @Override
    public void play() {
        System.out.println("Playing game in GameImp");
    }
}
