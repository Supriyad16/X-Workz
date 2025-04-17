package com.xworkz.external;

import com.xworkz.rules.Clip;

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

    @Override
    public void wears(){
        System.out.println("Wrear the hairclip");
    }

    public static void main(String[] args) {
        HairClip hairClip = new HairClip();
        hairClip.hold();
        hairClip.release();
        hairClip.open();
        hairClip.wears();
    }
}