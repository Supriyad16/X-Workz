package com.xworkz.external;

import com.xworkz.rules.Mask;

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

    @Override
    public void doctor(){
        System.out.println("doctor wear mask during operation");
    }

    public static void main(String[] args) {
        FaceMask faceMask = new FaceMask();
        faceMask.wear();
        faceMask.protect();
        faceMask.dispose();
        faceMask.doctor();
    }
}
