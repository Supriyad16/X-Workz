package com.xworkz.fest.work;

public class VideoGame extends Game {

    VideoGame() {
        super();
        System.out.println("VideoGame class");
    }

    @Override
    public void start() {
        System.out.println("VideoGame is starting");
    }

    @Override
    public void stop() {
        System.out.println("VideoGame is stopping");
    }

    @Override
    public void scorePoints() {
        System.out.println("VideoGame allows scoring points");
    }

    @Override
    public void difficulty() {
        System.out.println("VideoGame has difficulty settings");
    }

    @Override
    public void reset() {
        System.out.println("VideoGame can be reset");
    }
}