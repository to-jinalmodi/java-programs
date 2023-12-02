package com.xcelerateDesign.javaPrograms.ArrayExample;

import java.util.Scanner;

/**
 * Single dimension class.
 */
public class SingleDimension {

    public static void main(String[] args) {

        System.out.print("Enter your array: ");
        Scanner sc = new Scanner(System.in);

        String[] array = new String[sc.nextInt()];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Value for [ " + i + " ]: ");
            array[i] = sc.next();
        }

        for (String s : array) {
            System.out.println(s);
        }

    }

}
