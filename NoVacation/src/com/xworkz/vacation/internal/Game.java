package com.xworkz.vacation.internal;

public class Game {

    Game() {
        System.out.println("Game class");
    }

    public void start() {
        System.out.println("Game is starting");
    }

    public void stop() {
        System.out.println("Game is stopping");
    }

    public void scorePoints() {
        System.out.println("Game allows scoring points");
    }

    public void difficulty() {
        System.out.println("Game has difficulty settings");
    }

    public void reset() {
        System.out.println("Game can be reset");
    }
}
