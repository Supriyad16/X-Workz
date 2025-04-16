package com.xworkz.rules;

public class FloorRug implements Rug {

    @Override
    public void lay() {
        System.out.println("Laying the floor rug");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the floor rug");
    }

    @Override
    public void roll() {
        System.out.println("Rolling the floor rug");
    }

    public static void main(String[] args) {
        FloorRug rug = new FloorRug();
        rug.lay();
        rug.clean();
        rug.roll();
    }
}
