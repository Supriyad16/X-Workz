package com.xworkz.task.today;

public class ShopRunner {

    public static void main(String[] args) {
        Shop shop = new Shop("Green Pharmacy", "Raj", "Medical");
        System.out.println("Shop " + shop.toString());


        int code = shop.hashCode();
        String value="things";
        System.out.println("Super Mart:" + shop.hashCode());
        System.out.println("Super Mart:" + value.hashCode());

        Shop shop1 = new Shop("Shoe Garden", "Ravi", "Shoe");
        boolean equal= shop1.equals(shop1);
        System.out.println("equal :"+ equal);
    }
}
