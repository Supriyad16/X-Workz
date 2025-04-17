package com.xworkz.external;

import com.xworkz.rules.*;

public class Butter implements Cap, Fork, Pencil, Pin, Towel {

    @Override
    public void wear() {
        System.out.println("Wearing the cap");
    }

    @Override
    public void adjust() {
        System.out.println("Adjusting the cap");
    }

    @Override
    public void stick() {
        System.out.println("Pin is sticking");
    }

    @Override
    public void remove() {
        System.out.println("Removing the pin");
    }

    @Override
    public void bend() {
        System.out.println("Bending the pencil");
    }

    @Override
    public void poke() {
        System.out.println("Poking with the fork");
    }

    @Override
    public void lift() {
        System.out.println("Lifting the fork");
    }

    @Override
    public void dry() {
        System.out.println("Drying with the towel");
    }

    @Override
    public void wash() {
        System.out.println("Washing with the towel");
    }

    @Override
    public void fold() {
        System.out.println("Folding the towel");
    }

    @Override
    public void wrote() {
        System.out.println("Writing with the pencil");
    }

    @Override
    public void sharpen() {
        System.out.println("Sharpening the pencil");
    }

    @Override
    public void breakTip() {
        System.out.println("Breaking the pencil tip");
    }

    public static void main(String[] args) {
        Cap cap = new Butter();
        cap.wear();
        cap.adjust();

        Fork fork = new Butter();
        fork.wash();
        fork.lift();
        fork.poke();

        Pencil pencil = new Butter();
        pencil.wrote();
        pencil.sharpen();
        pencil.breakTip();

        Pin pin = new Butter();
        pin.remove();
        pin.bend();
        pin.stick();

        Towel towel = new Butter();
        towel.dry();
        towel.wash();
        towel.fold();
    }
}
