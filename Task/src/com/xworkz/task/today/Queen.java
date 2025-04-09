package com.xworkz.task.today;

public class Queen {
    private String name;
    private String kingdom;
    private boolean isReigning;

    public Queen(String name, String kingdom, boolean isReigning) {
        this.name = name;
        this.kingdom = kingdom;
        this.isReigning = isReigning;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", kingdom=" + kingdom + ", isReigning=" + isReigning + "]";
    }
}
