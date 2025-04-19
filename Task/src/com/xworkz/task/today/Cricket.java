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
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Cricket cricket = this;
                Cricket cricket1 = (Cricket) obj;
                if (cricket1.matchType.equals(cricket.matchType) && cricket1.players==cricket.players) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
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
