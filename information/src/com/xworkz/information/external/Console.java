package com.xworkz.information.external;

import com.xworkz.information.internal.Game;

public class Console {

    private Game game;

    public Console(Game game) {
        this.game = game;
        System.out.println("Arg constructor of Console");
    }

    public void startGame() {
        System.out.println("Starting console game...");
        if (this.game != null) {
            this.game.play();
        } else {
            System.out.println("Game is null");
        }
    }
}
