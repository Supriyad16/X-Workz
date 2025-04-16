package com.xworkz.rules;

public class WoodenPencil implements Pencil {

    @Override
    public void wrote() {
        System.out.println("Writing with the wooden pencil");
    }

    @Override
    public void sharpen() {
        System.out.println("Sharpening the wooden pencil");
    }

    @Override
    public void breakTip() {
        System.out.println("Breaking the tip of the wooden pencil");
    }

    public static void main(String[] args) {
        WoodenPencil pencil = new WoodenPencil();
        pencil.wrote();
        pencil.sharpen();
        pencil.breakTip();
    }
}
