package com.xworkz.external;

import com.xworkz.rules.*;

public class Clutch implements Bat, Ball, Leaf, File, Drum {

    @Override
    public void bounce() {
        System.out.println("Ball bouncing");
    }

    @Override
    public void roll() {
        System.out.println("Ball rolling");
    }

    @Override
    public void throwBall() {
        System.out.println("Ball thrown");
    }

    @Override
    public void swing() {
        System.out.println("Bat swinging");
    }

    @Override
    public void hit() {
        System.out.println("Bat hitting");
    }

    @Override
    public void grip() {
        System.out.println("Bat gripping");
    }

    @Override
    public void beat() {
        System.out.println("Drum beating");
    }

    @Override
    public void carry() {
        System.out.println("Carrying drum");
    }

    @Override
    public void tune() {
        System.out.println("Tuning the drum");
    }

    @Override
    public void open() {
        System.out.println("Opening the file");
    }

    @Override
    public void read() {
        System.out.println("Reading the file");
    }

    @Override
    public void close() {
        System.out.println("Closing the file");
    }

    @Override
    public void photosynthesize() {
        System.out.println("Leaf doing photosynthesis");
    }

    @Override
    public void fall() {
        System.out.println("Leaf falling");
    }

    @Override
    public void grow() {
        System.out.println("Leaf growing");
    }

    public static void main(String[] args) {
        Bat bat = new Clutch();
        bat.swing();
        bat.hit();
        bat.grip();

        Ball ball = new Clutch();
        ball.bounce();
        ball.roll();
        ball.throwBall();

        Leaf leaf = new Clutch();
        leaf.photosynthesize();
        leaf.fall();
        leaf.grow();

        File file = new Clutch();
        file.open();
        file.read();
        file.close();

        Drum drum = new Clutch();
        drum.beat();
        drum.carry();
        drum.tune();
    }
}