package com.xworkz.rules;

public class HairClip implements Clip {

    @Override
    public void hold() {
        System.out.println("Holding hair with the hair clip");
    }

    @Override
    public void release() {
        System.out.println("Releasing the hair clip");
    }

    @Override
    public void open() {
        System.out.println("Opening the hair clip");
    }

    public static void main(String[] args) {
        HairClip clip = new HairClip();
        clip.hold();
        clip.release();
        clip.open();
    }
}
