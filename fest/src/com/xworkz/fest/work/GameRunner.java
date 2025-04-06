package com.xworkz.fest.work;

public class GameRunner {
    public static void main(String[] args) {

        Game game = new VideoGame();
        game.start();
        game.stop();
        game.scorePoints();
        game.difficulty();
        game.reset();

        VideoGame videoGame = new VideoGame();
        videoGame.start();
        videoGame.start();
        videoGame.scorePoints();
        videoGame.difficulty();
        videoGame.reset();

    }
}
