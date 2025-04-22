package com.xworkz.information.internal;

public class PainterImp implements Painter {

    public PainterImp() {
        System.out.println("No-arg constructor of PainterImp");
    }

    @Override
    public void paint() {
        System.out.println("Painting on canvas in PainterImp");
    }
}
