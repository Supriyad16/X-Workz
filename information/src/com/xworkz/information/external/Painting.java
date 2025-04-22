package com.xworkz.information.external;

import com.xworkz.information.internal.Brush;

public class Painting {

    private Brush brush;

    public Painting(Brush brush) {
        this.brush = brush;
        System.out.println("Arg constructor of Painting");
    }

    public void startArt() {
        System.out.println("Starting the painting...");
        if (this.brush != null) {
            this.brush.stroke();
        } else {
            System.out.println("Brush is null");
        }
    }
}
