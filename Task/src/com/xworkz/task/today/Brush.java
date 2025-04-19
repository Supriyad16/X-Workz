package com.xworkz.task.today;

public class Brush {
    private String type;
    private int length;
    private String colour;

    public Brush(String type, int length, String colour) {
        this.type = type;
        this.length = length;
        this.colour = colour;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Brush brush = this;
                Brush brush1 = (Brush) obj;
                if (brush1.type.equals(brush.type) && brush1.colour.equals(brush.colour) ){
                    System.out.println("Both aare same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 14;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", brand=" + length + ", isElectric=" + colour + "]";
    }
}
