package com.xworkz.task.today;

public class NailPolish {

    private String shade;
    private String brand;
    private double price;

    public NailPolish(String shade, String brand, double price) {
        this.shade = shade;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                NailPolish nailPolish = this;
                NailPolish nailPolish1 = (NailPolish) obj;
                if (nailPolish1.shade.equals(nailPolish1.shade) && nailPolish1.price==nailPolish1.price) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 55;
    }

    @Override
    public String toString() {
        return "[shade=" + shade + ", brand=" + brand + ", price=" + price + "]";
    }
}
