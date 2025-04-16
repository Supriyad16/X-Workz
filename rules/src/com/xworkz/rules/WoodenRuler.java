package com.xworkz.rules;

public class WoodenRuler implements Ruler {

    @Override
    public void measure() {
        System.out.println("Measuring with the wooden ruler");
    }

    @Override
    public void mark() {
        System.out.println("Marking with the wooden ruler");
    }

    @Override
    public void draw() {
        System.out.println("Drawing a straight line with the wooden ruler");
    }

    public static void main(String[] args) {
        WoodenRuler ruler = new WoodenRuler();
        ruler.measure();
        ruler.mark();
        ruler.draw();
    }
}
