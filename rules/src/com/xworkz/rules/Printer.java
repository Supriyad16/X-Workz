package com.xworkz.rules;

public class Printer implements Leaf, Lid, Knife, Mask, Nail {

    @Override
    public void cut() {
        System.out.println("Cutting with the knife");
    }

    @Override
    public void slice() {
        System.out.println("Slicing with the knife");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the mask");
    }

    @Override
    public void photosynthesize() {
        System.out.println("Leaf photosynthesizing");
    }

    @Override
    public void fall() {
        System.out.println("Leaf falling");
    }

    @Override
    public void grow() {
        System.out.println("Leaf growing");
    }

    @Override
    public void cover() {
        System.out.println("Covering with the lid");
    }

    @Override
    public void open() {
        System.out.println("Opening the lid");
    }

    @Override
    public void seal() {
        System.out.println("Sealing with the lid");
    }

    @Override
    public void wear() {
        System.out.println("Wearing the mask");
    }

    @Override
    public void protect() {
        System.out.println("Mask protecting");
    }

    @Override
    public void dispose() {
        System.out.println("Disposing the mask");
    }

    @Override
    public void hammer() {
        System.out.println("Hammering the nail");
    }

    @Override
    public void pull() {
        System.out.println("Pulling the nail");
    }

    @Override
    public void rust() {
        System.out.println("Nail rusting");
    }

    public static void main(String[] args) {
        Leaf leaf = new Printer();
        leaf.photosynthesize();
        leaf.fall();
        leaf.grow();

        Lid lid = new Printer();
        lid.open();
        lid.seal();
        lid.cover();

        Knife knife = new Printer();
        knife.cut();
        knife.slice();

        Mask mask = new Printer();
        mask.wear();
        mask.protect();
        mask.dispose();

        Nail nail = new Printer();
        nail.hammer();
        nail.pull();
        nail.rust();
    }
}
