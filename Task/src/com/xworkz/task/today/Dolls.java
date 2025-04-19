package com.xworkz.task.today;

public class Dolls {
    private String type;
    private String material;
    private double height;

    public Dolls(String type, String material, double height) {
        this.type = type;
        this.material = material;
        this.height = height;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Dolls dolls = this;
                Dolls dolls1 = (Dolls) obj;
                if (dolls1.type.equals(dolls.type) && dolls1.material==dolls.material) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 27;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", material=" + material + ", height=" + height + " cm]";
    }
}
