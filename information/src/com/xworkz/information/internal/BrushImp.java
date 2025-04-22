package com.xworkz.information.internal;

public class BrushImp implements Brush {

    public BrushImp() {
        System.out.println("No-arg constructor of BrushImp");
    }

    @Override
    public void stroke() {
        System.out.println("Brushing strokes in BrushImp");
    }
}
