package com.xworkz.information.external;

import com.xworkz.information.internal.Saloon;

public class Parlour {

    private Saloon saloon;

    public Parlour(Saloon saloon) {
        this.saloon = saloon;
        System.out.println("Arg constructor of Parlour");
    }

    public void style() {
        System.out.println("style in Parlour");
        if (this.saloon != null) {
            this.saloon.groom();
        } else {
            System.out.println("Saloon is null");
        }
    }
}
