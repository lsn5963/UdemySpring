package com.in28minutes.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements GamingConsole{
    @Override
    public void up() {
        System.out.println("up");
    }

    @Override
    public void down() {

    }

    @Override
    public void left() {

    }

    @Override
    public void right() {

    }
}
