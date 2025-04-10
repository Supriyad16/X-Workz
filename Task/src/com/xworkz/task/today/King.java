package com.xworkz.task.today;

public class King {
    private String name;
    private String kingdom;
    private int age;

    public King(String name, String kingdom, int age) {
        this.name = name;
        this.kingdom = kingdom;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return 43;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", kingdom=" + kingdom + ", age=" + age + "]";
    }
}
