package com.xworkz.task.today;

public class TeaRunner {
    public static void main(String[] args) {
        Tea tea = new Tea("Masala", true, 4);
        System.out.println("Tea " + tea.toString());

        int code = tea.hashCode();
        String value="powder";
        System.out.println("Evening Drink:" + tea.hashCode());
        System.out.println("Evening Drink:" + value.hashCode());

        Tea tea1 = new Tea("Normal", true, 5);
        boolean equal= tea1.equals(tea1);
        System.out.println("equal :"+ equal);
    }
}
