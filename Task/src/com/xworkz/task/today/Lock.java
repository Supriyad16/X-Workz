package com.xworkz.task.today;

public class Lock {
    private String type;
    private String material;
    private boolean isDigital;

    public Lock(String type, String material, boolean isDigital) {
        this.type = type;
        this.material = material;
        this.isDigital = isDigital;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Lock lock = this;
                Lock lock1 = (Lock) obj;
                if (lock1.type.equals(lock.type) && lock1.material.equals(lock.material) ){
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 48;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", material=" + material + ", isDigital=" + isDigital + "]";
    }
}
