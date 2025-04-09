package com.xworkz.task.today;

public class FileRunner {

    public static void main(String[] args) {
        File file = new File("PDF", 2.5, "Resume");
        System.out.println("File " + file.toString());
    }
}
