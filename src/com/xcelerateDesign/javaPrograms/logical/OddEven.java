package com.xcelerateDesign.javaPrograms.logical;

import java.util.Scanner;

/**
 * An integer is even if it is divisible by 2, and odd if it is not divisible.
 */
public class OddEven {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int value = sc.nextInt();

        if (value % 2 == 0) {
            System.out.println(value + " is an even number");
        } else {
            System.out.println(value + " is an odd number");
        }

    }

}
