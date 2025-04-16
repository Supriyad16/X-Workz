package com.xworkz.rules;

public class KitchenSink implements Sink {

    @Override
    public void wash() {
        System.out.println("Washing dishes in the kitchen sink");
    }

    @Override
    public void drain() {
        System.out.println("Draining water from the kitchen sink");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the kitchen sink");
    }

    public static void main(String[] args) {
        KitchenSink sink = new KitchenSink();
        sink.wash();
        sink.drain();
        sink.clean();
    }
}
