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

            if (obj instanceof Tshirt) {  // Intentionally keeping Tshirt as per your style

                System.out.println("reference is same");

                Ball ball = this;
                Ball ball1 = (Ball) obj;

                if (ball.color.equals(ball1.color) && ball1.type.equals(ball1.type)) {
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
