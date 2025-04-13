package com.xworkz.task.today;

public class OfficeRunner {
    public static void main(String[] args) {
        Office office = new Office("Xworkz Solutions", "Bangalore", 10);
        System.out.println("Office " + office.toString());

        int code = office.hashCode();
        String value="Work from home";
        System.out.println("Duty:" + office.hashCode());
        System.out.println("Duty:" + value.hashCode());

        Office office1 = new Office("Tap Academy", "Banglore", 15);
        boolean equal= office1.equals(office1);
        System.out.println("equal :"+ equal);
    }
}
