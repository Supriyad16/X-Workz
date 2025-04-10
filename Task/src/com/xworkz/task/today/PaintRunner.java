package com.xworkz.task.today;

public class PaintRunner {

    public static void main(String[] args) {
        Paint paint = new Paint("Asian Paints", "Red", 1500);
        System.out.println("Paint " + paint.toString());

        int code = paint.hashCode();
        String value="Brand";
        System.out.println("Nippon:" + paint.hashCode());
        System.out.println("Nippon:" + value.hashCode());
    }
}
