package com.xworkz.task.today;

public class BallRunner {

    public static void main(String[] args) {
        Ball ball = new Ball("White", "Tennis", 140);
        System.out.println("Ball " + ball.toString());


        int code = ball.hashCode();
        String value="ball";
        System.out.println("Material:" + ball.hashCode());
        System.out.println("Material:" + value.hashCode());
    }
}