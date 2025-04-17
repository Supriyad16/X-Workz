package com.xworkz.external;

import com.xworkz.rules.Ball;
import com.xworkz.rules.Bat;

public class GameKit implements Bat, Ball {

    @Override
    public void hit() {
        System.out.println("Hitting the ball with the bat");
    }

    @Override
    public void swing() {
        System.out.println("Swinging the bat in the air");
    }

    @Override
    public void grip() {
        System.out.println("Gripping the bat tightly");
    }

    @Override
    public void bounce() {
        System.out.println("Bouncing the ball on the ground");
    }

    @Override
    public void roll() {
        System.out.println("Rolling the ball on the floor");
    }

    @Override
    public void throwBall() {
        System.out.println("Throwing the ball");
    }

    public static void main(String[] args) {
        Bat bat = new GameKit();
        bat.hit();
        bat.swing();
        bat.grip();

        Ball ball = new GameKit();
        ball.bounce();
        ball.roll();
        ball.throwBall();
    }
}
