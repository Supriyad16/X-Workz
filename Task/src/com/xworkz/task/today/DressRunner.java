package com.xworkz.task.today;

public class DressRunner {

        public static void main(String[] args) {
            Dress dress = new Dress("Velvet", "Navy Blue", 10000);
            System.out.println("Dress" + dress.toString());

            int code = dress.hashCode();
            String value="pant";
            System.out.println("Type:" + dress.hashCode());
            System.out.println("Type:" + value.hashCode());

            Dress dress1 = new Dress("Cotton", "White", 650);
            boolean equal= dress1.equals(dress1);
            System.out.println("equal :"+ equal);
        }
    }