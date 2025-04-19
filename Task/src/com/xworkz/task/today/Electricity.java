package com.xworkz.task.today;

public class Electricity {

    private String source;
    private int voltage;
    private boolean isAvailable;

    public Electricity(String source, int voltage, boolean isAvailable) {
        this.source = source;
        this.voltage = voltage;
        this.isAvailable = isAvailable;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Electricity electricity = this;
                Electricity electricity1 = (Electricity) obj;
                if (electricity1.source.equals(electricity.source) && electricity1.voltage==electricity.voltage) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 29;
    }

    @Override
    public String toString() {
        return "[source=" + source + ", voltage=" + voltage + "V, isAvailable=" + isAvailable + "]";
    }
}
