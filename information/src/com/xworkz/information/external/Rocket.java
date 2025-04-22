package com.xworkz.information.external;

import com.xworkz.information.internal.Aerospace;

public class Rocket {

    private Aerospace aerospace;

    public Rocket(Aerospace aerospace) {
        this.aerospace = aerospace;
        System.out.println("Arg constructor of Rocket");
    }

    public void ignite() {
        System.out.println("ignite in Rocket");
        if (this.aerospace != null) {
            this.aerospace.launch();
        } else {
            System.out.println("Aerospace is null");
        }
    }
}
