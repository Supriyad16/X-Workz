package com.xworkz.task.today;

public class File {

    private String type;
    private double size;
    private String name;

    public File(String type, double size, String name) {
        this.type = type;
        this.size = size;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return 30;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", size=" + size + "MB, name=" + name + "]";
    }
}
