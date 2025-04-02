package com.xworkz.fest.work;

public class VideoGame extends Game {

    VideoGame() {
        super();
        System.out.println("VideoGame class");
    }

    public void loadGraphics() {
        System.out.println("Video game loads high-quality graphics");
    }

    public void multiplayerMode() {
        System.out.println("Video game has a multiplayer mode");
    }

    public void saveProgress() {
        System.out.println("Video game saves progress");
    }

    public void unlockLevels() {
        System.out.println("Video game allows unlocking new levels");
    }

    public void playWithController() {
        System.out.println("Video game can be played with a controller");
    }
}
