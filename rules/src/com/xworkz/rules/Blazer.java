package com.xworkz.rules;

public class Blazer implements Mirror, Comb, Pad, Pipe, Bolt {

    @Override
    public void tighten() {
        System.out.println("Tightening the bolt");
    }

    @Override
    public void loosen() {
        System.out.println("Loosening the bolt");
    }

    @Override
    public void rust() {
        System.out.println("Bolt getting rusty");
    }

    @Override
    public void untangle() {
        System.out.println("Untangling the comb");
    }

    @Override
    public void hold() {
        System.out.println("Holding the comb");
    }

    @Override
    public void reflect() {
        System.out.println("Reflecting with mirror");
    }

    @Override
    public void hang() {
        System.out.println("Hanging the mirror");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the mirror");
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

    @Override
    public void flow() {
        System.out.println("Water flowing through pipe");
    }

    @Override
    public void bends() {
        System.out.println("Pipe is bending");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pipe");
    }

    public static void main(String[] args) {
        Mirror mirror = new Blazer();
        mirror.reflect();
        mirror.hang();
        mirror.clean();

        Comb comb = new Blazer();
        comb.hold();
        comb.untangle();

        Pad pad = new Blazer();
        pad.write();
        pad.tear();
        pad.bind();

        Pipe pipe = new Blazer();
        pipe.flow();
        pipe.bends();
        pipe.cut();

        Bolt bolt = new Blazer();
        bolt.tighten();
        bolt.loosen();
        bolt.rust();
    }
}