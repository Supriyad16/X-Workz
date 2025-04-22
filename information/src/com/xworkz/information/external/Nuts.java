package com.xworkz.information.external;

import com.xworkz.information.internal.Screw;

public class Nuts {

    private Screw screw;

    public Nuts(Screw screw) {
        this.screw = screw;
        System.out.println("Arg constructor of Nuts");
    }

    public void fit() {
        System.out.println("fit in Nuts");
        if (this.screw != null) {
            this.screw.tighten();
        } else {
            System.out.println("Screw is null");
        }
    }
}
