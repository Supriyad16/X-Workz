package com.xworkz.poster.hybrid;

public class Clay extends Soil {
    public void mold() {
        System.out.println("Clay is molded into shapes.");
    }

    public static void main(String[] args) {
        Clay clay = new Clay();
        clay.rotate();
        clay.nourish();
        clay.mold();

        Mud mud = new Mud();
        mud.rotate();
        mud.stick();
    }
}
