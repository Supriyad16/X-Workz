package com.xworkz.task.today;

public class RouterRunner {
    public static void main(String[] args) {
        Router router = new Router("Edge", "Airtel", true);
        System.out.println("Router " + router.toString());

        int code = router.hashCode();
        String value="connect";
        System.out.println("Wifi:" + router.hashCode());
        System.out.println("Wifi:" + value.hashCode());

        Router router1 = new Router("Virtual", "Jio", true);
        boolean equal= router1.equals(router1);
        System.out.println("equal :"+ equal);
    }
}
