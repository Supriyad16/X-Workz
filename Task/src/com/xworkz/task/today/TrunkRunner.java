package com.xworkz.task.today;

public class TrunkRunner {
    public static void main(String[] args) {
        Trunk trunk = new Trunk("DefaultType", "DefaultBrand", true);
        System.out.println("Trunk " + trunk.toString());

        int code = trunk.hashCode();
        String value="Bird";
        System.out.println("Wood Pecker:" + trunk.hashCode());
        System.out.println("Wood Pecker:" + value.hashCode());
    }
}
