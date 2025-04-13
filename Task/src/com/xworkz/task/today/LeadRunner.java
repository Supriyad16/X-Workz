package com.xworkz.task.today;

public class LeadRunner {
    public static void main(String[] args) {
        Lead lead = new Lead(500, "Solid", true);
        System.out.println("Lead " + lead.toString());

        int code = lead.hashCode();
        String value="metal";
        System.out.println("Pencil:" + lead.hashCode());
        System.out.println("Pencil:" + value.hashCode());

        Lead lead1 = new Lead(150, "Powder", true);
        boolean equal= lead1.equals(lead1);
        System.out.println("equal :"+ equal);
    }
}
