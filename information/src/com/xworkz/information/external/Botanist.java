package com.xworkz.information.external;

import com.xworkz.information.internal.Garden;

public class Botanist {

    private Garden garden;

    public Botanist(Garden garden) {
        this.garden = garden;
        System.out.println("Arg constructor of Botanist");
    }

    public void examine() {
        System.out.println("Examining the garden...");
        if (this.garden != null) {
            this.garden.grow();
        } else {
            System.out.println("Garden is null");
        }
    }
}
