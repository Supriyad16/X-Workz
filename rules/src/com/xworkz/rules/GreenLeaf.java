package com.xworkz.rules;

public class GreenLeaf implements Leaf {

    @Override
    public void photosynthesize() {
        System.out.println("Green leaf is photosynthesizing");
    }

    @Override
    public void fall() {
        System.out.println("Green leaf falls from the tree");
    }

    @Override
    public void grow() {
        System.out.println("Green leaf is growing");
    }

    public static void main(String[] args) {
        GreenLeaf leaf = new GreenLeaf();
        leaf.photosynthesize();
        leaf.fall();
        leaf.grow();
    }
}
