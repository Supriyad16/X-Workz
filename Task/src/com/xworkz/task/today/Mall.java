package com.xworkz.task.today;

public class Mall {

    private String name;
    private int numberOfShops;
    private String city;

    public Mall(String name, int numberOfShops, String city) {
        this.name = name;
        this.numberOfShops = numberOfShops;
        this.city = city;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Mall mall = this;
                Mall mall1 = (Mall) obj;
                if (mall1.name.equals(mall.name) && mall1.city.equals(mall.city)) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 50;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", numberOfShops=" + numberOfShops + ", city=" + city + "]";
    }
}
