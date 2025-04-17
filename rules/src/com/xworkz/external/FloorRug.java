package com.xworkz.external;

import com.xworkz.rules.Rug;

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

    @Override
    public void cover(){
        System.out.println("cover floor by rug");
    }

    public static void main(String[] args) {
        FloorRug floorRug = new FloorRug();
        floorRug.lay();
        floorRug.clean();
        floorRug.roll();
        floorRug.cover();
    }
}
