package com.xworkz.task.today;

public class Lock {
    private String type;
    private String material;
    private boolean isDigital;

    public Lock(String type, String material, boolean isDigital) {
        this.type = type;
        this.material = material;
        this.isDigital = isDigital;
    }


    @Override
    public int hashCode() {
        return 48;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", material=" + material + ", isDigital=" + isDigital + "]";
    }
}
