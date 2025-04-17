package com.xworkz.external;

import com.xworkz.rules.Lens;
import com.xworkz.rules.Lid;

public class Focus implements Lens, Lid {

    @Override
    public void focus() {
        System.out.println("Focusing the lens");
    }

    @Override
    public void adjust() {
        System.out.println("Zooming in with the lens");
    }

    @Override
    public void zoom() {
        System.out.println("Zooming out with the lens");
    }

    @Override
    public void cover() {
        System.out.println("Closing the lid");
    }

    @Override
    public void open() {
        System.out.println("Opening the lid");
    }

    @Override
    public void seal() {
        System.out.println("Securing the lid tightly");
    }

    public static void main(String[] args) {
        Lens lens = new Focus();
        lens.focus();
        lens.adjust();
        lens.zoom();

        Lid lid = new Focus();
        lid.cover();
        lid.open();
        lid.seal();
    }
}
