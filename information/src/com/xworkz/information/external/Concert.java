package com.xworkz.information.external;

import com.xworkz.information.internal.Musician;

public class Concert {

    private Musician musician;

    public Concert(Musician musician) {
        this.musician = musician;
        System.out.println("Arg constructor of Concert");
    }

    public void beginShow() {
        System.out.println("Concert is beginning...");
        if (this.musician != null) {
            this.musician.perform();
        } else {
            System.out.println("Musician is null");
        }
    }
}
