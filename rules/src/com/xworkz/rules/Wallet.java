package com.xworkz.rules;

public class Wallet implements Quilt, Ring, Rod, Rug, Ruler {

    @Override
    public void cover() {
        System.out.println("Covering with the quilt");
    }

    @Override
    public void warm() {
        System.out.println("Warming with the quilt");
    }

    @Override
    public void lay() {
        System.out.println("Laying the rug");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the rug");
    }

    @Override
    public void roll() {
        System.out.println("Rolling the rug");
    }

    @Override
    public void wear() {
        System.out.println("Wearing the ring");
    }

    @Override
    public void remove() {
        System.out.println("Removing the ring");
    }

    @Override
    public void resize() {
        System.out.println("Resizing the ring");
    }

    @Override
    public void hold() {
        System.out.println("Holding the rod");
    }

    @Override
    public void bend() {
        System.out.println("Bending the rod");
    }

    @Override
    public void extend() {
        System.out.println("Extending the rod");
    }

    @Override
    public void measure() {
        System.out.println("Measuring with the ruler");
    }

    @Override
    public void mark() {
        System.out.println("Marking with the ruler");
    }

    @Override
    public void draw() {
        System.out.println("Drawing with the ruler");
    }

    public static void main(String[] args) {
        Quilt quilt = new Wallet();
        quilt.cover();
        quilt.warm();
        quilt.clean();

        Ring ring = new Wallet();
        ring.wear();
        ring.remove();
        ring.resize();

        Rod rod = new Wallet();
        rod.hold();
        rod.bend();
        rod.extend();

        Rug rug = new Wallet();
        rug.lay();
        rug.clean();
        rug.roll();

        Ruler ruler = new Wallet();
        ruler.measure();
        ruler.mark();
        ruler.draw();
    }
}
