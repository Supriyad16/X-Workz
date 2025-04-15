package com.xworkz.poster.hierarchical;

public class Signal extends Tower {
    void guidePlanes() {
        System.out.println("Guiding aircraft during landing");
    }

    public static void main(String[] args) {
        Signal signal = new Signal();
        signal.stand();
        signal.guidePlanes();
    }
}
