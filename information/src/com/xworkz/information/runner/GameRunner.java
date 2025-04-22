package com.xworkz.information.runner;

import com.xworkz.information.internal.Game;
import com.xworkz.information.internal.GameImp;
import com.xworkz.information.external.Console;

public class GameRunner {

    public static void main(String[] args) {
        Game game = new GameImp();
        Console console = new Console(game);
        console.startGame();
    }
}
