package com.xworkz.external;

import com.xworkz.rules.*;

public class Penguin implements Mask, Brick, Box, Clip, Jar {

    @Override
    public void pack() {
        System.out.println("Packing the box");
    }

    @Override
    public void hold() {
        System.out.println("Holding the clip");
    }

    @Override
    public void release() {
        System.out.println("Releasing the clip");
    }

    @Override
    public void open() {
        System.out.println("Opening the jar");
    }

    @Override
    public void store() {
        System.out.println("Storing items in the jar");
    }

    @Override
    public void close() {
        System.out.println("Closing the jar");
    }

    @Override
    public void seal() {
        System.out.println("Sealing the box");
    }

    @Override
    public void build() {
        System.out.println("Building with bricks");
    }

    @Override
    public void breakBrick() {
        System.out.println("Breaking a brick");
    }

    @Override
    public void weigh() {
        System.out.println("Weighing the brick");
    }

    @Override
    public void wear() {
        System.out.println("Wearing the mask");
    }

    @Override
    public void protect() {
        System.out.println("Mask protecting from dust");
    }

    @Override
    public void dispose() {
        System.out.println("Disposing the mask");
    }

    public static void main(String[] args) {
        Box box = new Penguin();
        box.pack();
        box.seal();
        box.open();

        Clip clip = new Penguin();
        clip.hold();
        clip.release();
        clip.open();

        Jar jar = new Penguin();
        jar.open();
        jar.store();
        jar.close();

        Brick brick = new Penguin();
        brick.build();
        brick.breakBrick();
        brick.weigh();

        Mask mask = new Penguin();
        mask.wear();
        mask.protect();
        mask.dispose();
    }
}
