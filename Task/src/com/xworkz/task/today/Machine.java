package com.xworkz.task.today;

public class Machine {
    private String type;
    private String usage;
    private int power;

    public Machine(String type, String usage, int power) {
        this.type = type;
        this.usage = usage;
        this.power = power;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Machine machine = this;
                Machine machine1 = (Machine) obj;
                if (machine1.type.equals(machine.type) && machine1.power==machine.power) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 49;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", usage=" + usage + ", power=" + power + "W]";
    }
}
