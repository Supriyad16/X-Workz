package com.xworkz.fest.work;

class Towel extends Woolen {
    Towel() {
        super();
        System.out.println("Towel class");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public void warmth() {
        System.out.println("Woolen fabric provides warmth.");
    }

    @Override
    public void soft() {
        System.out.println("Woolen materials have a soft texture.");
    }

    @Override
    public void absorbsMoisture() {
        System.out.println("Woolen fabrics can absorb moisture.");
    }

    @Override
    public void durable() {
        System.out.println("Woolen materials are highly durable.");
    }

    public void usedInClothing() {
        System.out.println("Woolen fabric is widely used for clothing.");
    }
}