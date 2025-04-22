package com.xworkz.information.external;

import com.xworkz.information.internal.Painter;

public class Canvas {

    private Painter painter;

    public Canvas(Painter painter) {
        this.painter = painter;
        System.out.println("Arg constructor of Canvas");
    }

    public void startPainting() {
        System.out.println("Starting painting...");
        if (this.painter != null) {
            this.painter.paint();
        } else {
            System.out.println("Painter is null");
        }
    }
}
