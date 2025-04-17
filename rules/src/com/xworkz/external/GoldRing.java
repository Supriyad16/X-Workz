package com.xworkz.external;

import com.xworkz.rules.Ring;

public class GoldRing implements Ring {

    @Override
    public void wear() {
        System.out.println("Wearing the gold ring");
    }

    @Override
    public void remove() {
        System.out.println("Removing the gold ring");
    }

    @Override
    public void resize() {
        System.out.println("Resizing the gold ring");
    }

    @Override
    public void designs(){
        System.out.println("gold ring have designs");
    }

    public static void main(String[] args) {
        GoldRing goldRing = new GoldRing();
        goldRing.wear();
        goldRing.remove();
        goldRing.resize();
        goldRing.designs();
    }
}
