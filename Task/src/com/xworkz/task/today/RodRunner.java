package com.xworkz.task.today;

public class RodRunner {

    public static void main(String[] args) {
        Rod rod = new Rod("Iron", 2.5, 1.2);
        System.out.println("Rod " + rod.toString());

        int code = rod.hashCode();
        String value="pole";
        System.out.println("Weight:" + rod.hashCode());
        System.out.println("Weight:" + value.hashCode());

        Rod rod1 = new Rod("steel", 3.0, 2);
        boolean equal= rod1.equals(rod1);
        System.out.println("equal :"+ equal);
    }
}
