package com.xworkz.task.today;

public class SheetRunner {

    public static void main(String[] args) {
        Sheet sheet = new Sheet("Cotton", "Queen", "White");
        System.out.println("Sheet " + sheet.toString());

        int code = sheet.hashCode();
        String value="cover";
        System.out.println("Silver:" + sheet.hashCode());
        System.out.println("Silver:" + value.hashCode());
    }
}
