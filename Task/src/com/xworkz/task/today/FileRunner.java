package com.xworkz.task.today;

public class FileRunner {

    public static void main(String[] args) {
        File file = new File("PDF", 2.5, "Resume");
        System.out.println("File " + file.toString());

        int code = file.hashCode();
        String value="save";
        System.out.println("Important:" + file.hashCode());
        System.out.println("Important:" + value.hashCode());

        File file1 = new File("DOC", 100, "IEEE Paper");
        boolean equal= file1.equals(file1);
        System.out.println("equal :"+ equal);
    }
}
