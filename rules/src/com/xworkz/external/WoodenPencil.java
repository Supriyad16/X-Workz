package com.xworkz.external;

import com.xworkz.rules.Pencil;

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

    @Override
    public void lead(){
        System.out.println("Wooden pencil has lead");
    }

    public static void main(String[] args) {
        WoodenPencil woodenPencil = new WoodenPencil();
        woodenPencil.wrote();
        woodenPencil.sharpen();
        woodenPencil.breakTip();
        woodenPencil.lead();
    }
}
