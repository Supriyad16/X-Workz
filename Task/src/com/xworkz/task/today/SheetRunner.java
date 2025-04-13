package com.xworkz.task.today;

public class SheetRunner {

    public static void main(String[] args) {
        Sheet sheet = new Sheet("Steel", "Queen", "White");
        System.out.println("Sheet " + sheet.toString());

        int code = sheet.hashCode();
        String value="cover";
        System.out.println("Silver:" + sheet.hashCode());
        System.out.println("Silver:" + value.hashCode());

        Sheet sheet1 = new Sheet("Gold", "King", "Gold ");
        boolean equal= sheet1.equals(sheet1);
        System.out.println("equal :"+ equal);
    }
}
