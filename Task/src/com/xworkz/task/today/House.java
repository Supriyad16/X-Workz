package com.xworkz.task.today;

public class House {
    private String type;
    private int rooms;
    private boolean hasGarden;

    public House(String type, int rooms, boolean hasGarden) {
        this.type = type;
        this.rooms = rooms;
        this.hasGarden = hasGarden;
    }

    @Override
    public int hashCode() {
        return 37;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", rooms=" + rooms + ", hasGarden=" + hasGarden + "]";
    }
}
