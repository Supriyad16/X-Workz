package com.xworkz.rules;

public class Garland implements Phone, Rug, Ruler, Sink, Soap {

    @Override
    public void call() {
        System.out.println("Making a call");
    }

    @Override
    public void text() {
        System.out.println("Sending a text");
    }

    @Override
    public void browse() {
        System.out.println("Browsing on the phone");
    }

    @Override
    public void lay() {
        System.out.println("Laying the rug");
    }

    @Override
    public void lather() {
        System.out.println("Lathering soap");
    }

    @Override
    public void wash() {
        System.out.println("Washing with soap");
    }

    @Override
    public void dry() {
        System.out.println("Drying with the rug");
    }

    @Override
    public void drain() {
        System.out.println("Draining water");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the surface with soap");
    }

    @Override
    public void roll() {
        System.out.println("Rolling the rug");
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
        System.out.println("Drawing a line with the ruler");
    }

    public static void main(String[] args) {
        Phone phone = new Garland();
        phone.call();
        phone.text();
        phone.browse();

        Rug rug = new Garland();
        rug.lay();
        rug.clean();
        rug.roll();

        Ruler ruler = new Garland();
        ruler.measure();
        ruler.mark();
        ruler.draw();

        Sink sink = new Garland();
        sink.drain();
        sink.clean();
        sink.wash();

        Soap soap = new Garland();
        soap.lather();
        soap.wash();
        soap.dry();
    }
}