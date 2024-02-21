package com.xcelerateDesign.javaPrograms.logical;

import java.util.Scanner;

/**
 * Reverse integer number.
 */
public class ReverseNumber {

    public static void main(String[] args) {

        int number;
        int reverse = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        number = sc.nextInt();

        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }

        System.out.println(reverse);

    }

}
