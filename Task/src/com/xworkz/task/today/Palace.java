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
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Palace palace = this;
                Palace palace1 = (Palace) obj;
                if (palace1.name.equals(palace.name) && palace1.age==palace.age) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }
    @Override
    public int hashCode() {
        return 61;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", age=" + age + " years, city=" + city + "]";
    }
}
