package com.mahesh.spring.learnspringframework.game;


import org.springframework.stereotype.Component;


public class SuperContraGame implements GamingConsole {


        public void up(){
            System.out.println("Supercontra Up");
        }
        public void down(){
            System.out.println("SuperContra Down");
        }
        public void left(){
            System.out.println("SuperContra Left");
        }
        public void right(){
            System.out.println("SuperContra Right");
        }
    }


