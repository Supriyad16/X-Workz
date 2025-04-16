package com.xworkz.rules;

public class Cut implements Knife, Mask {

    @Override
    public void cut() {
        System.out.println("Cutting with the knife");
    }

    @Override
    public void clean() {
        System.out.println("Sharpening the knife");
    }

    @Override
    public void slice() {
        System.out.println("Slicing with the knife");
    }

    @Override
    public void wear() {
        System.out.println("Wearing the mask");
    }

    @Override
    public void dispose() {
        System.out.println("Removing the mask");
    }

    @Override
    public void protect() {
        System.out.println("Cleaning the mask");
    }

    public static void main(String[] args) {
        Knife knife = new Cut();
        knife.cut();
        knife.clean();
        knife.slice();

        Mask mask = new Cut();
        mask.wear();
        mask.dispose();
        mask.protect();
    }
}
