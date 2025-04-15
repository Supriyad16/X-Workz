package com.xworkz.poster.hybrid;

public class Drill extends Cutter {
    public void bore() {
        System.out.println("Drill makes holes.");
    }

    public static void main(String[] args) {
        Drill drill = new Drill();
        drill.use();
        drill.cut();
        drill.bore();

        Grinder grinder = new Grinder();
        grinder.use();
        grinder.grind();
    }
}
