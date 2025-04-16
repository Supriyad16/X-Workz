package com.xworkz.rules;

public class Drink implements Mug, Mat {

    @Override
    public void fill() {
        System.out.println("Holding the mug");
    }

    @Override
    public void sip() {
        System.out.println("Drinking from the mug");
    }

    @Override
    public void wash() {
        System.out.println("Cleaning the mug");
    }

    @Override
    public void lay() {
        System.out.println("Placing the mug on the mat");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the mat");
    }

    @Override
    public void step() {
        System.out.println("Rolling the mat");
    }

    public static void main(String[] args) {
        Mug mug = new Drink();
        mug.fill();
        mug.sip();
        mug.wash();

        Mat mat = new Drink();
        mat.lay();
        mat.clean();
        mat.step();
    }
}
