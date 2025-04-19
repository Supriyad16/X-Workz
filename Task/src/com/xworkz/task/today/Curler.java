package com.xworkz.task.today;

public class Curler {
    private String type;
    private int temperature;
    private boolean isAutomatic;

    public Curler(String type, int temperature, boolean isAutomatic) {
        this.type = type;
        this.temperature = temperature;
        this.isAutomatic = isAutomatic;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Curler curler= this;
                Curler curler1 = (Curler) obj;
                if (curler1.type.equals(curler.type) && curler1.temperature==curler.temperature) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 25;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", temperature=" + temperature + "°C, isAutomatic=" + isAutomatic + "]";
    }
}
