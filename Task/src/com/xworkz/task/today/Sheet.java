package com.xworkz.task.today;

public class Sheet {

    private String material;
    private String size;
    private String color;

    public Sheet(String material, String size, String color) {
        this.material = material;
        this.size = size;
        this.color = color;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Sheet sheet = this;
                Sheet sheet1 = (Sheet) obj;
                if (sheet1.material.equals(sheet.material) && sheet1.size==sheet.size) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 73;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", size=" + size + ", color=" + color + "]";
    }
}
