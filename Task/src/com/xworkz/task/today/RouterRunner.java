package com.xworkz.task.today;

public class RouterRunner {
    public static void main(String[] args) {
        Router router = new Router("DefaultType", "DefaultBrand", true);
        System.out.println("Router " + router.toString());

        int code = router.hashCode();
        String value="connect";
        System.out.println("Wifi:" + router.hashCode());
        System.out.println("Wifi:" + value.hashCode());
    }
}
