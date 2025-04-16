package com.xworkz.rules;

public class FaceMask implements Mask {

    @Override
    public void wear() {
        System.out.println("Wearing the face mask");
    }

    @Override
    public void protect() {
        System.out.println("Protecting from dust and germs");
    }

    @Override
    public void dispose() {
        System.out.println("Disposing of the used face mask");
    }

    public static void main(String[] args) {
        FaceMask mask = new FaceMask();
        mask.wear();
        mask.protect();
        mask.dispose();
    }
}
