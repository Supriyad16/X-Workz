package com.xworkz.task.today;

public class Tshirt {

    private String brand;
    private int size;
    private String color;
//2 method: set:init,get:read


    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

//    public String getBrand() {
//        return brand;
//    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is notnull");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Tshirt tshirt1 = this;
                Tshirt tshirt = (Tshirt) obj;
                if (tshirt1.brand.equals(tshirt.brand) && tshirt1.size==tshirt.size) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }
}
//comparing non primitive use = .equals