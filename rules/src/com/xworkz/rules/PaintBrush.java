package com.xworkz.rules;

public class PaintBrush implements Brush {

    @Override
    public void paint() {
        System.out.println("Painting with the brush");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the paint brush");
    }

    @Override
    public void dry() {
        System.out.println("Dipping the paint brush");
    }

    public static void main(String[] args) {
        PaintBrush brush = new PaintBrush();
        brush.paint();
        brush.clean();
        brush.dry();
    }
}
