package com.xworkz.rules;

public class Illuminate implements Lamp, Leaf {

    @Override
    public void glow() {
        System.out.println("Lighting up the lamp");
    }

    @Override
    public void switchOff() {
        System.out.println("Switching off the lamp");
    }

    @Override
    public void switchOn() {
        System.out.println("Increasing the brightness of the lamp");
    }

    @Override
    public void fall() {
        System.out.println("Fluttering the leaf in the wind");
    }

    @Override
    public void grow() {
        System.out.println("The leaf grows on the tree");
    }

    @Override
    public void photosynthesize() {
        System.out.println("Changing the color of the leaf in fall");
    }

    public static void main(String[] args) {
        Lamp lamp = new Illuminate();
        lamp.glow();
        lamp.switchOff();
        lamp.switchOn();

        Leaf leaf = new Illuminate();
        leaf.fall();
        leaf.grow();
        leaf.photosynthesize();
    }
}
