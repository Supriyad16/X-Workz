package com.xworkz.vacation.internal;

public class PlayStation extends VideoGame{

    public void freeTime(Game game){

        game.scorePoints();

        if (game instanceof VideoGame){

            VideoGame videoGame = (VideoGame) game;
            videoGame.start();
            videoGame.start();
            videoGame.scorePoints();
            videoGame.difficulty();
            videoGame.reset();
        }
    }
}
