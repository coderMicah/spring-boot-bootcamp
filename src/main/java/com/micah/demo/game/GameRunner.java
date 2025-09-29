package com.micah.demo.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

    private GamingConsole game;

    public GameRunner(@Qualifier("PacmanGameQualifier") GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running");
        game.down();
        game.up();
        game.left();
        game.right();

    }
}
