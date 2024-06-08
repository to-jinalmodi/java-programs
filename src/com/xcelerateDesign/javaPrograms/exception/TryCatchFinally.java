package com.xcelerateDesign.javaPrograms.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * try {
 *     // block of code to monitor for errors
 *     // the code you think can raise an exception
 * } catch (ExceptionType1 exOb) {
 *     // exception handler for ExceptionType1
 * } catch (ExceptionType2 exOb) {
 *     // exception handler for ExceptionType2
 * }
 * // optional
 * finally {  // block of code to be executed after try block ends
 * }
 */
public class TryCatchFinally {

    public static void main(String[] args) {

        int division;
        
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter first value: ");
            int value1 = scanner.nextInt();
            System.out.print("Enter second value: ");
            int value2 = scanner.nextInt();

            division = value1 / value2;
            System.out.println("Output is: " + division);
        }

        catch (ArithmeticException | InputMismatchException e) {
            System.out.println("invalid input error: " + e);
        }

        catch (Exception e) {
            System.out.println("Any other error: " + e);
        }

        finally {
           System.out.println("I am something should always execute");
        }

    }

}
