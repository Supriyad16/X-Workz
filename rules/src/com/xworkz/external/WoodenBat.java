package com.xworkz.external;

import com.xworkz.rules.Bat;

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

    @Override
    public void happy(){
        System.out.println("Be happy while playing");
    }

    public static void main(String[] args) {
        WoodenBat woodenBat = new WoodenBat();
        woodenBat.swing();
        woodenBat.hit();
        woodenBat.grip();
    }
}
