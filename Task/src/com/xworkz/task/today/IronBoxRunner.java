package com.xworkz.task.today;

public class IronBoxRunner {
    public static void main(String[] args) {
        IronBox ironBox = new IronBox("Philips", 1200, true);
        System.out.println("IronBox " + ironBox.toString());

        int code = ironBox.hashCode();
        String value="heat";
        System.out.println("Iron the Dress:" + ironBox.hashCode());
        System.out.println("Iron the Dress:" + value.hashCode());
    }
}
