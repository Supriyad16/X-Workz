package com.xworkz.task.today;

public class BallRunner {

    public static void main(String[] args) {
        Ball ball = new Ball("White", "Tennis", 140);
        System.out.println("Ball " + ball.toString());


        int code = ball.hashCode();
        String value="ball";
        System.out.println("Material:" + ball.hashCode());
        System.out.println("Material:" + value.hashCode());

        Ball ball1 = new Ball("Purple", "Plastic", 5);
        boolean equal= ball.equals(ball1);
        System.out.println("equal :"+ equal);


    }
}