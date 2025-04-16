package com.xworkz.rules;

public class Comet implements Bowl, Lock, Lamp, Bell, Coin {

    @Override
    public void ring() {
        System.out.println("Bell is ringing");
    }

    @Override
    public void hang() {
        System.out.println("Hanging the bell");
    }

    @Override
    public void sound() {
        System.out.println("Bell produces sound");
    }

    @Override
    public void holdFood() {
        System.out.println("Bowl is holding food");
    }

    @Override
    public void wash() {
        System.out.println("Washing the bowl");
    }

    @Override
    public void cover() {
        System.out.println("Covering the bowl");
    }

    @Override
    public void flip() {
        System.out.println("Flipping the coin");
    }

    @Override
    public void toss() {
        System.out.println("Tossing the coin");
    }

    @Override
    public void shine() {
        System.out.println("Coin is shining");
    }

    @Override
    public void switchOn() {
        System.out.println("Switching on the lamp");
    }

    @Override
    public void switchOff() {
        System.out.println("Switching off the lamp");
    }

    @Override
    public void glow() {
        System.out.println("Lamp is glowing");
    }

    @Override
    public void lock() {
        System.out.println("Locking the lock");
    }

    @Override
    public void unlock() {
        System.out.println("Unlocking the lock");
    }

    @Override
    public void test() {
        System.out.println("Testing the lock mechanism");
    }

    public static void main(String[] args) {
        Bowl bowl = new Comet();
        bowl.holdFood();
        bowl.wash();
        bowl.cover();

        Lock lock = new Comet();
        lock.lock();
        lock.unlock();
        lock.test();

        Lamp lamp = new Comet();
        lamp.switchOn();
        lamp.switchOff();
        lamp.glow();

        Bell bell = new Comet();
        bell.ring();
        bell.hang();
        bell.sound();

        Coin coin = new Comet();
        coin.flip();
        coin.toss();
        coin.shine();
    }
}
