package com.xworkz.task.today;

public class Cotton {

    private String quality;
    private double weight;
    private String use;

    public Cotton(String quality, double weight, String use) {
        this.quality = quality;
        this.weight = weight;
        this.use = use;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Cotton cotton = this;
                Cotton cotton1 = (Cotton) obj;
                if (cotton1.quality.equals(cotton1.quality) && cotton1.weight==cotton1.weight) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 23;
    }

    @Override
    public String toString() {
        return "[quality=" + quality + ", weight=" + weight + "kg, use=" + use + "]";
    }
}
