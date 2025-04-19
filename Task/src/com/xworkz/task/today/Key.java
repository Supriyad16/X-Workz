package com.xworkz.task.today;

public class Key {
    private String type;
    private String material;
    private boolean isDuplicate;

    public Key(String type, String material, boolean isDuplicate) {
        this.type = type;
        this.material = material;
        this.isDuplicate = isDuplicate;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Key key = this;
                Key key1 = (Key) obj;
                if (key1.type.equals(key.type) && key1.material==key.material) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 41;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", material=" + material + ", isDuplicate=" + isDuplicate + "]";
    }
}
