package com.xworkz.task.today;

public class Box {
    private String material;
    private double length;
    private double width;

    public Box(String material, double length, double width) {
        this.material = material;
        this.length = length;
        this.width = width;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Box box = this;
                Box box1 = (Box) obj;
                if (box1.length==(box.length) && box1.width==box.width) {
                    System.out.println("Both aare same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 13;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", length=" + length + " cm, width=" + width + " cm]";
    }
}
