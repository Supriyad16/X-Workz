package com.xworkz.task.today;

public class Diamond {
    private double carat;
    private String clarity;
    private double price;

    public Diamond(double carat, String clarity, double price) {
        this.carat = carat;
        this.clarity = clarity;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Diamond diamond = this;
                Diamond diamond1 = (Diamond) obj;
                if (diamond1.price==(diamond1.price) && diamond1.carat==diamond1.carat) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 26;
    }

    @Override
    public String toString() {
        return "[carat=" + carat + ", clarity=" + clarity + ", price=" + price + "]";
    }
}
