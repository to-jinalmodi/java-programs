package com.xcelerateDesign.javaPrograms.arrayExample;

import java.util.Scanner;

/**
 * Transpose of an array is obtained by interchanging the rows and columns
 * of the given array or vice versa.
 */
public class TransposeArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("How many rows and columns: ");
        int rowsNCols = sc.nextInt();
        int[][] a = new int[rowsNCols][rowsNCols];

        System.out.println("Enter your multidimensional array");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("Value for [ " + i + " ][ " + j + " ]: ");
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Print Array");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " | ");
            }
            System.out.println("");
        }

        System.out.println("Transpose Array");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[j][i] + " | ");
            }
            System.out.println("");
        }

    }

}
