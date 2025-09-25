package com.micah.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.micah.demo.game.GameRunner;

@Configuration
@ComponentScan("com.micah.demo.game")
public class GameAppLauncher {

    public static void main(String[] args) {

        try (var ctx = new AnnotationConfigApplicationContext(GameAppLauncher.class);) {
            var gameRunner = ctx.getBean(GameRunner.class);
            gameRunner.run();
        }
    }
}
