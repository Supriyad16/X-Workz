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
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                King king = this;
                King king1 = (King) obj;
                if (king1.name.equals(king.name) && king1.kingdom.equals(king.kingdom)) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
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
