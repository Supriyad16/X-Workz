package com.xworkz.task.today;

public class Key {
    private String type;
    private String material;
    private boolean isDuplicate;

    public Key(String type, String material, boolean isDuplicate) {
        this.type = type;
        this.material = material;
        this.isDuplicate = isDuplicate;
    }

    @Override
    public int hashCode() {
        return 41;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", material=" + material + ", isDuplicate=" + isDuplicate + "]";
    }
}
