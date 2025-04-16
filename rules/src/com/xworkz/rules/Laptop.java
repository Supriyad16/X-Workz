package com.xworkz.rules;

public class Laptop implements Lens, Mat, Mug, Mirror, Pad {

    @Override
    public void focus() {
        System.out.println("Focusing the lens");
    }

    @Override
    public void zoom() {
        System.out.println("Zooming with the lens");
    }

    @Override
    public void adjust() {
        System.out.println("Adjusting the lens");
    }

    @Override
    public void lay() {
        System.out.println("Laying the mat");
    }

    @Override
    public void step() {
        System.out.println("Stepping on the mat");
    }

    @Override
    public void reflect() {
        System.out.println("Reflecting in the mirror");
    }

    @Override
    public void hang() {
        System.out.println("Hanging the mirror");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the mug");
    }

    @Override
    public void fill() {
        System.out.println("Filling the mug");
    }

    @Override
    public void sip() {
        System.out.println("Sipping from the mug");
    }

    @Override
    public void wash() {
        System.out.println("Washing the mug");
    }

    @Override
    public void write() {
        System.out.println("Writing on the pad");
    }

    @Override
    public void tear() {
        System.out.println("Tearing the pad");
    }

    @Override
    public void bind() {
        System.out.println("Binding the pad");
    }

    public static void main(String[] args) {
        Lens lens = new Laptop();
        lens.focus();
        lens.zoom();
        lens.adjust();

        Mat mat = new Laptop();
        mat.lay();
        mat.step();
        mat.clean();

        Mirror mirror = new Laptop();
        mirror.reflect();
        mirror.hang();
        mirror.clean();

        Mug mug = new Laptop();
        mug.fill();
        mug.sip();
        mug.wash();

        Pad pad = new Laptop();
        pad.write();
        pad.tear();
        pad.bind();
    }
}
