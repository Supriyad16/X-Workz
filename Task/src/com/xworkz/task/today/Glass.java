package com.xworkz.task.today;

public class Glass {
    private String type;
    private double volume;
    private boolean isTransparent;

    public Glass(String type, double volume, boolean isTransparent) {
        this.type = type;
        this.volume = volume;
        this.isTransparent = isTransparent;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Glass glass = this;
                Glass glass1 = (Glass) obj;
                if (glass1.type.equals(glass.type) && glass1.volume==glass.volume) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", volume=" + volume + "ml, isTransparent=" + isTransparent + "]";
    }
}
