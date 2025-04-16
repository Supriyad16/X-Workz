package com.xworkz.rules;

public class ClayBrick implements Brick {

    @Override
    public void build() {
        System.out.println("Building with clay brick");
    }

    @Override
    public void breakBrick() {
        System.out.println("Breaking the clay brick");
    }

    @Override
    public void weigh() {
        System.out.println("Weighing the clay brick");
    }

    public static void main(String[] args) {
        ClayBrick brick = new ClayBrick();
        brick.build();
        brick.breakBrick();
        brick.weigh();
    }
}
