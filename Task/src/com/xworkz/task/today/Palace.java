package com.xworkz.task.today;

public class Palace {
    private String name;
    private int age;
    private String city;

    public Palace(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", age=" + age + " years, city=" + city + "]";
    }
}
