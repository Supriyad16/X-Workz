package com.xworkz.information.external;

import com.xworkz.information.internal.Farmer;

public class Retailers {

    private Farmer farmer;

    public Retailers(Farmer farmer) {
        this.farmer = farmer;
        System.out.println("Arg constructor of Retailers");
    }

    public void supply() {
        System.out.println("supply in Retailers");
        if (this.farmer != null) {
            this.farmer.cultivate();
        } else {
            System.out.println("Farmer is null");
        }
    }
}
