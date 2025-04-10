package com.xworkz.task.today;

public class TelevisionRunner {

    public static void main(String[] args) {
        Television television = new Television("Samsung", 55, true);
        System.out.println("Television " + television.toString());

        int code = television.hashCode();
        String value="program";
        System.out.println("Entertainment:" + television.hashCode());
        System.out.println("Entertainment:" + value.hashCode());
    }
}
