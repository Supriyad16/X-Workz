package com.xworkz.fest.work;

public class GameRunner {
    public static void main(String[] args) {

        Game game = new VideoGame();
        game.start();
        game.stop();
        game.scorePoints();
        game.setDifficulty();
        game.reset();



        VideoGame videoGame = new VideoGame();
        videoGame.loadGraphics();
        videoGame.multiplayerMode();
        videoGame.saveProgress();
        videoGame.unlockLevels();
        videoGame.playWithController();
    }
}
