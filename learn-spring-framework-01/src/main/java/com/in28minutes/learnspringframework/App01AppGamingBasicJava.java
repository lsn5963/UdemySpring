package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.PacmanGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;

public class App01AppGamingBasicJava {
    public static void main(String[] args) {
//        var game = new MarioGame();
        var game = new SuperContraGame();
        var pacmanGame = new PacmanGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
