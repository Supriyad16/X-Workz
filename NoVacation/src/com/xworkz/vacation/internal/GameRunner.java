package com.xworkz.vacation.internal;


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

    PlayStation playStation = new PlayStation();
    playStation.start();
    playStation.start();
    playStation.scorePoints();
    playStation.difficulty();
    playStation.reset();

}
}
