package com.xworkz.external;

import com.xworkz.rules.Leaf;

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

    @Override
    public void colour(){
        System.out.println("leaf is in green colour");
    }

    public static void main(String[] args) {
        GreenLeaf greenLeaf = new GreenLeaf();
        greenLeaf.photosynthesize();
        greenLeaf.fall();
        greenLeaf.grow();
        greenLeaf.colour();
    }
}
