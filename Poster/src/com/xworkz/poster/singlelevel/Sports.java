package com.xworkz.poster.singlelevel;

public class Sports {
    String type;
    int players;

    public Sports(String type, int players) {
        this.type = type;
        this.players = players;
    }

    public void play() {
        System.out.println("Playing a sport for fun and fitness");
    }
}
