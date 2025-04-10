package com.xworkz.task.today;

public class HeadphoneRunner {
    public static void main(String[] args) {
        Headphone headphone = new Headphone("DefaultType", "DefaultBrand", true);
        System.out.println("Headphone " + headphone.toString());

        int code = headphone.hashCode();
        String value="music";
        System.out.println("Sound:" + headphone.hashCode());
        System.out.println("Sound:" + value.hashCode());
    }
}
