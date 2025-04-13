package com.xworkz.task.today;

public class Tree {
    private String type;
    private String brand;
    private boolean isAvailable;

    public Tree(String type, String brand, boolean isAvailable) {
        this.type = type;
        this.brand = brand;
        this.isAvailable = isAvailable;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Tree tree = this;
                Tree tree1 = (Tree) obj;
                if (tree1.type.equals(tree1.type) && tree1.brand==tree1.brand) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 94;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", brand=" + brand + ", isAvailable=" + isAvailable + "]";
    }
}
