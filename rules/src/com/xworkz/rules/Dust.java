package com.xworkz.rules;

public class Dust implements Brick, Brush {

    @Override
    public void build() {
        System.out.println("Building with the brick");
    }

    @Override
    public void breakBrick() {
        System.out.println("Stacking the brick");
    }

    @Override
    public void weigh() {
        System.out.println("Transporting the brick");
    }

    @Override
    public void paint() {
        System.out.println("Painting with the brush");
    }

    @Override
    public void dry() {
        System.out.println("Dipping the brush in paint");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the paintbrush");
    }

    public static void main(String[] args) {
        Brick brick = new Dust();
        brick.build();
        brick.breakBrick();
        brick.weigh();

        Brush brush = new Dust();
        brush.paint();
        brush.dry();
        brush.clean();
    }
}
