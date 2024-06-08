package com.xcelerateDesign.javaPrograms.exception;

import java.util.Scanner;

/**
 * Throw and Throws.
 */
public class ThrowThrows {

    public static void main(String[] args) {

        try {
            int division = divide();
            System.out.println("Output is: " + division);
        }

        catch (Exception e) {
            System.out.println("Exception occurred in divide: " + e);
        }

        finally {
            System.out.println("I am something should always execute");
        }

    }

    private static int divide() throws ArithmeticException {

        int division;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first value : ");
        int value1 = scanner.nextInt();
        System.out.print("Enter second value : ");
        int value2 = scanner.nextInt();

        if (value2 == 0) {
            throw new ArithmeticException();
        }

        division = value1 / value2;

        return division;

    }

}
