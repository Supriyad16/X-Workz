package com.xworkz.rules;

public class Grind implements Bowl, Bolt {

    @Override
    public void cover() {
        System.out.println("Pouring the soup into the bowl");
    }

    @Override
    public void wash() {
        System.out.println("Serving the soup from the bowl");
    }

    @Override
    public void holdFood() {
        System.out.println("Cleaning the bowl after use");
    }

    @Override
    public void loosen() {
        System.out.println("Fastening the bolt in place");
    }

    @Override
    public void tighten() {
        System.out.println("Rotating the bolt");
    }

    @Override
    public void rust() {
        System.out.println("Rust on the bolt");
    }

    public static void main(String[] args) {
        Bowl bowl = new Grind();
        bowl.cover();
        bowl.wash();
        bowl.holdFood();

        Bolt bolt = new Grind();
        bolt.loosen();
        bolt.tighten();
        bolt.rust();
    }
}
