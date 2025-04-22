package com.xworkz.information.external;

import com.xworkz.information.internal.Projector;

public class Epson {

    private Projector projector;

    public Epson(Projector projector) {
        this.projector = projector;
        System.out.println("Arg constructor of Epson");
    }

    public void startProjection() {
        System.out.println("startProjection in Epson");
        if (this.projector != null) {
            this.projector.display();
        } else {
            System.out.println("Projector is null");
        }
    }
}
