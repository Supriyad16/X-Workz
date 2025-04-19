package com.xworkz.task.today;

public class Shop {

    private String name;
    private String owner;
    private String type;

    public Shop(String name, String owner, String type) {
        this.name = name;
        this.owner = owner;
        this.type = type;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Shop shop = this;
                Shop shop1 = (Shop) obj;
                if (shop1.name.equals(shop.name) && shop1.type.equals(shop1.type) ){
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }
    @Override
    public int hashCode() {
        return 75;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", owner=" + owner + ", type=" + type + "]";
    }
}
