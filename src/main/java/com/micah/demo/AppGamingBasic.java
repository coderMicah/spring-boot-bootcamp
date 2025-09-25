package com.micah.demo;

import com.micah.demo.game.GameRunner;
import com.micah.demo.game.MarioGame;
import com.micah.demo.game.PacmanGame;
import com.micah.demo.game.SuperContraGame;

public class AppGamingBasic {

    public static void main(String[] args) {

        // var game = new MarioGame();
        // var game = new SuperContraGame();
        var game = new PacmanGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
