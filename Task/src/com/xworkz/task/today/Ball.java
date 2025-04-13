package com.xworkz.task.today;

public class Ball {

    private String color;
    private String type;
    private double weight;

    public Ball(String color, String type, double weight) {
        this.color = color;
        this.type = type;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Ball aeroplane = this;
                Ball ball = (Ball) obj;
                if (ball.color.equals(ball.color) && ball.type==ball.type) {
                    System.out.println("Both aare same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 6;
    }

    @Override
    public String toString() {
        return "[color=" + color + ", type=" + type + ", weight=" + weight + "g]";
    }
}
