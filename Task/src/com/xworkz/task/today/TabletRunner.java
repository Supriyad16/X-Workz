package com.xworkz.task.today;

public class TabletRunner {

    public static void main(String[] args) {
        Tablet tablet = new Tablet("Paracetamol", 500, "Fever");
        System.out.println("Tablet " + tablet.toString());

        int code = tablet.hashCode();
        String value="Medicine";
        System.out.println("Pills:" + tablet.hashCode());
        System.out.println("Pills:" + value.hashCode());
    }
}
