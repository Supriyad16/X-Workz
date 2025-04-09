package com.xworkz.task.today;

public class Shop {

    private String name;
    private String owner;
    private String type;

    public Shop(String name, String owner, String type) {
        this.name = name;
        this.owner = owner;
        this.type = type;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", owner=" + owner + ", type=" + type + "]";
    }
}
