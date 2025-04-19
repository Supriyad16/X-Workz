package com.xworkz.task.today;

public class Coffee {
    private String type;
    private boolean hasMilk;
    private int sugarLevel;

    public Coffee(String type, boolean hasMilk, int sugarLevel) {
        this.type = type;
        this.hasMilk = hasMilk;
        this.sugarLevel = sugarLevel;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Coffee coffee = this;
                Coffee coffee1 = (Coffee) obj;
                if (coffee1.type.equals(coffee.type) && coffee1.sugarLevel==coffee.sugarLevel) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 22;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", hasMilk=" + hasMilk + ", sugarLevel=" + sugarLevel + "]";
    }
}
