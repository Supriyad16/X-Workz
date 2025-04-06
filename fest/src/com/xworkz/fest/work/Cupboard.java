package com.xworkz.fest.work;

class Cupboard extends Wood {
    Cupboard() {
        super();
        System.out.println("Cupboard class");
    }

    @Override
    public void strongMaterial() {
        System.out.println("cupboard is made of wood.");
    }

    @Override
    public void furniture() {
        System.out.println("cupboard is a furniture.");
    }

    @Override
    public void types() {
        System.out.println("cupboard can be made of different types like teak, oak, and pine.");
    }

    @Override
    public void naturalResource() {
        System.out.println("Cupboard is made of natural resource.");
    }

    @Override
    public void polish() {
        System.out.println("Cupboard can be polished for a better finish and durability.");
    }
}