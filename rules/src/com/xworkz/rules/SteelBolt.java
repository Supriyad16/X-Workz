package com.xworkz.rules;

public class SteelBolt implements Bolt {

    @Override
    public void tighten() {
        System.out.println("Tightening the steel bolt");
    }

    @Override
    public void loosen() {
        System.out.println("Loosening the steel bolt");
    }

    @Override
    public void rust() {
        System.out.println("Steel bolt getting rusted");
    }

    public static void main(String[] args) {
        SteelBolt bolt = new SteelBolt();
        bolt.tighten();
        bolt.loosen();
        bolt.rust();
    }
}
