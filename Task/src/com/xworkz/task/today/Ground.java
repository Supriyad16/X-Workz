package com.xworkz.task.today;

public class Ground {
    private String name;
    private String type;
    private double area;

    public Ground(String name, String type, double area) {
        this.name = name;
        this.type = type;
        this.area = area;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Ground ground = this;
                Ground ground1 = (Ground) obj;
                if (ground1.name.equals(ground.name) && ground1.area==ground.area) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 34;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", type=" + type + ", area=" + area + " sq.m]";
    }
}
