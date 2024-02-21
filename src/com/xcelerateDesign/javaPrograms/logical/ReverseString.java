package com.xcelerateDesign.javaPrograms.logical;

import java.util.Scanner;

/**
 * Reverse string.
 */
public class ReverseString {

    public static void main(String[] args) {

        String str;
        int index = 0;
        StringBuilder reverse = new StringBuilder();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        str = sc.nextLine();

        //while (index < str.length()) {
        //    reverse = str.charAt(index++) + reverse;
        //}

        while (index < str.length()) {
            reverse.insert(0, str.charAt(index++));
        }

        System.out.println(reverse);

    }

}
