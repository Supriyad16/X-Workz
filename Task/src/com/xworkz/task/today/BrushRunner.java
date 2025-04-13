package com.xworkz.task.today;

public class BrushRunner {
    public static void main(String[] args) {
        Brush brush = new Brush("Toothbrush", 10, "White");
        System.out.println("Brush " + brush.toString());
        System.out.println("Brush " + brush.hashCode());

        int code = brush.hashCode();
        String value="daily";
        System.out.println("Teeth:" + brush.hashCode());
        System.out.println("Teeth:" + value.hashCode());

        Brush brush1 = new Brush("Paintbrush", 100, "BLack");
        boolean equal= brush1.equals(brush1);
        System.out.println("equal :"+ equal);
    }
}
