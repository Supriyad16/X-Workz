package com.xworkz.fest.work;

class Tile extends Black {
    Tile() {
        super();
        System.out.println("Tile class");
    }

    @Override
    public void dark() {
        System.out.println("Black tile represents mystery.");
    }

    @Override
    public void absorbsLight() {
        System.out.println("Black tile  absorbs all light.");
    }

    @Override
    public void colour() {
        System.out.println("Black colour is often used in interior and fashion design.");
    }

    @Override
    public void beauty() {
        System.out.println("Black tile symbolizes elegance and sophistication.");
    }

    @Override
    public void attracts() {
        System.out.println("Black attracts.");
    }
}