package com.xworkz.inheritance;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {


        int[] num = {1, 2, 3, 4, 5};

        int[] num2 = new int[num.length];

        int j = 0;

        for (int i = num.length - 1; i >= 0; i--) {

            num2[j] = num[i];
            j++;
        }

        for (int i:num2){
            System.out.println(i);
        }

    }
}