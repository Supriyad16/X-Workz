package com.xworkz.information.external;

import com.xworkz.information.internal.Knife;

public class Chop {

    private Knife knife;

    public Chop(Knife knife) {
        this.knife = knife;
        System.out.println("Arg constructor of Chopping");
    }

    public void chopVegetables() {
        System.out.println("Chopping vegetables...");
        if (this.knife != null) {
            this.knife.cut();
        } else {
            System.out.println("Knife is null");
        }
    }
}
