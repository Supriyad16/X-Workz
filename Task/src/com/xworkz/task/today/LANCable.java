package com.xworkz.task.today;

public class LANCable {

    private String type;
    private int length;
    private boolean isShielded;

    public LANCable(String type, int length, boolean isShielded) {
        this.type = type;
        this.length = length;
        this.isShielded = isShielded;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                LANCable lanCable = this;
                LANCable lanCable1 = (LANCable) obj;
                if (lanCable1.type.equals(lanCable.type) && lanCable1.length==lanCable.length) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 44;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", length=" + length + "m, isShielded=" + isShielded + "]";
    }
}
