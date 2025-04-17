package com.xworkz.external;

import com.xworkz.rules.Chain;

public class IronChain implements Chain {

    @Override
    public void link() {
        System.out.println("Linking the iron chain");
    }

    @Override
    public void swing() {
        System.out.println("Swinging the iron chain");
    }

    @Override
    public void lock() {
        System.out.println("Locking with the iron chain");
    }

    @Override
    public void beauty(){
        System.out.println("Iron chain is beautiful");
    }

    public static void main(String[] args) {
        IronChain ironChain = new IronChain();
        ironChain.link();
        ironChain.swing();
        ironChain.lock();
        ironChain.beauty();

    }
}
