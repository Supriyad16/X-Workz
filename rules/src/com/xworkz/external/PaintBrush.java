package com.xworkz.external;

import com.xworkz.rules.Brush;

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

    @Override
    public void designPattern(){
        System.out.println("Design using paint brush");
    }

    public static void main(String[] args) {
        PaintBrush paintBrush = new PaintBrush();
        paintBrush.paint();
        paintBrush.clean();
        paintBrush.dry();
        paintBrush.designPattern();
    }
}
