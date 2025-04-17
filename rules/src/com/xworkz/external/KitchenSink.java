package com.xworkz.external;

import com.xworkz.rules.Sink;

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

    @Override
    public void dirtyVessels(){
        System.out.println("clean the dirty vessels");
    }

    public static void main(String[] args) {
        KitchenSink kitchenSink = new KitchenSink();
        kitchenSink.wash();
        kitchenSink.drain();
        kitchenSink.clean();
        kitchenSink.dirtyVessels();
    }
}
