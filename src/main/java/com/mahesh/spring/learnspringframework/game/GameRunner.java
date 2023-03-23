package com.mahesh.spring.learnspringframework.game;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

    @Autowired
    private  MarioGame game2;
    public GameRunner(MarioGame game) {
        this.game2 = game;
    }



    public void run() {


        game2.down();
        game2.left();
        game2.right();
        game2.up();
    }
}
