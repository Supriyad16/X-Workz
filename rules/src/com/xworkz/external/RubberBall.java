package com.xworkz.external;

import com.xworkz.rules.Ball;

public class RubberBall implements Ball {

    @Override
    public void bounce() {
        System.out.println("Bouncing the rubber ball");
    }

    @Override
    public void roll() {
        System.out.println("Rolling the rubber ball");
    }

    @Override
    public void throwBall() {
        System.out.println("Throwing the rubber ball");
    }

    @Override
    public void material(){
        System.out.println("Ball is made of material");
    }

    public static void main(String[] args) {
        RubberBall ball = new RubberBall();
        ball.bounce();
        ball.roll();
        ball.throwBall();
        ball.material();
    }
}
