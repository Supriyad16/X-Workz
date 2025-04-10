package com.xworkz.task.today;

public class Cricket {

    private String matchType;
    private int players;
    private String location;

    public Cricket(String matchType, int players, String location) {
        this.matchType = matchType;
        this.players = players;
        this.location = location;
    }

    @Override
    public int hashCode() {
        return 24;
    }

    @Override
    public String toString() {
        return "[matchType=" + matchType + ", players=" + players + ", location=" + location + "]";
    }
}
