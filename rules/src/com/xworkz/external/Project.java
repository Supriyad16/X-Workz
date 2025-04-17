package com.xworkz.external;

import com.xworkz.rules.*;

public class Project implements Bag, Book, Bat, Ball, Bell {
    @Override
    public void carry() {
        System.out.println("carry bag");
    }

    @Override
    public void hold() {
        System.out.println("hold bag");

    }

    @Override
    public void store() {
        System.out.println("store bag");

    }

    @Override
    public void bounce() {
        System.out.println("bounce ball");

    }

    @Override
    public void roll() {
        System.out.println("roll ball");

    }

    @Override
    public void throwBall() {
        System.out.println("throw ball");

    }

    @Override
    public void swing() {
        System.out.println("swing bat");

    }

    @Override
    public void hit() {
        System.out.println("hir bat");

    }

    @Override
    public void grip() {
        System.out.println("grip bat");

    }

    @Override
    public void ring() {
        System.out.println("ring bell");

    }

    @Override
    public void hang() {
        System.out.println("hang bell");

    }

    @Override
    public void sound() {
        System.out.println("sound bell");

    }

    @Override
    public void open() {
        System.out.println("open book");

    }

    @Override
    public void read() {
        System.out.println("read book");

    }

    @Override
    public void close() {
        System.out.println("close book");

    }

    public static void main(String[] args) {

        Bag bag = new Project();
        bag.store();
        bag.hold();
        bag.carry();

        Book book = new Project();
        book.read();
        book.open();
        book.close();

        Bat bat = new Project();
        bat.grip();
        bat.hit();
        bat.swing();

        Ball ball = new Project();
        ball.throwBall();
        ball.roll();
        ball.bounce();

        Bell bell = new Project();
        bell.hang();
        bell.ring();
        bell.sound();
    }
}
