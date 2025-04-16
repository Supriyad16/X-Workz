package com.xworkz.rules;

public class WoodenBat implements Bat {

    @Override
    public void swing() {
        System.out.println("Swinging the wooden bat");
    }

    @Override
    public void hit() {
        System.out.println("Hitting with the wooden bat");
    }

    @Override
    public void grip() {
        System.out.println("Holding the wooden bat grip");
    }

    public static void main(String[] args) {
        WoodenBat bat = new WoodenBat();
        bat.swing();
        bat.hit();
        bat.grip();
    }
}
