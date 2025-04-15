package com.xworkz.poster.hierarchical;

public class Mars extends Planet {
    void showRocks() {
        System.out.println("Mars has red rocky surface");
    }

    public static void main(String[] args) {
        Mars mars = new Mars();
        mars.rotate();
        mars.showRocks();
    }
}
