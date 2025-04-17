package com.xworkz.external;

import com.xworkz.rules.Ruler;

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

    @Override
    public void beat(){
        System.out.println("beat using wooden ruler");
    }

    public static void main(String[] args) {
        WoodenRuler woodenRuler = new WoodenRuler();
        woodenRuler.measure();
        woodenRuler.mark();
        woodenRuler.draw();
        woodenRuler.beat();
    }
}
