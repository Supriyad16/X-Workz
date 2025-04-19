package com.xworkz.task.today;

public class Queen {
    private String name;
    private String kingdom;
    private boolean isReigning;

    public Queen(String name, String kingdom, boolean isReigning) {
        this.name = name;
        this.kingdom = kingdom;
        this.isReigning = isReigning;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Queen queen = this;
                Queen queen1 = (Queen) obj;
                if (queen1.name.equals(queen.name) && queen1.isReigning==queen.isReigning) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 67;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", kingdom=" + kingdom + ", isReigning=" + isReigning + "]";
    }
}
