package com.xworkz.poster.hybrid;

public class Lava extends Flame {
    public void flow() {
        System.out.println("Lava is flowing.");
    }

    public static void main(String[] args) {
        Lava lava = new Lava();
        lava.burn();
        lava.glow();
        lava.flow();

        Smoke smoke = new Smoke();
        smoke.burn();
        smoke.rise();
    }
}
