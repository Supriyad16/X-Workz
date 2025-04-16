package com.xworkz.rules;

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

    public static void main(String[] args) {
        IronChain chain = new IronChain();
        chain.link();
        chain.swing();
        chain.lock();
    }
}
