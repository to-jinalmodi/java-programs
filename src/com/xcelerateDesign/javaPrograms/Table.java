package com.xcelerateDesign.javaPrograms;

import java.util.Scanner;

/**
 * The {@code Table} program prints the multiplication table
 * of a given number entered by the user.
 * <p>
 * Steps performed:
 * <ol>
 *     <li>Prompt the user to enter a number.</li>
 *     <li>Generate the multiplication table for that number from 1 to 10.</li>
 *     <li>Display each step of the table in the format: {@code number * i = result}.</li>
 * </ol>
 *
 * <p><b>Example:</b></p>
 * <pre>
 * Enter the Number of Table: 5
 * 5 * 1 = 5
 * 5 * 2 = 10
 * 5 * 3 = 15
 * ...
 * 5 * 10 = 50
 * </pre>
 */
public class Table {

    /**
     * Main method that serves as the program entry point.
     * Reads a number from the user and prints its multiplication table from 1 to 10.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Table: ");
        int n = sc.nextInt();

        // Loop to generate and display multiplication table
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}
