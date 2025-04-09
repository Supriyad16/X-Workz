package com.xworkz.task.today;

public class RouterRunner {
    public static void main(String[] args) {
        Router router = new Router("DefaultType", "DefaultBrand", true);
        System.out.println("Router " + router.toString());
    }
}
