package com.xcelerateDesign.javaPrograms.arrayExample;

import java.util.Scanner;

/**
 * 2(D) Array Two dimension class.
 */
public class TwoDimension {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("How many rows: ");
        int rows = sc.nextInt();
        int[][] a = new int[rows][];

        for (int rowsCount = 0; rowsCount < a.length; rowsCount++) {
            System.out.print("How many cols for row " + (rowsCount + 1) + " : ");
            int columns = sc.nextInt();
            a[rowsCount] = new int[columns];
        }

        System.out.println("Enter your multidimensional array");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("Value for [ " + i + " ][ " + j + " ]: ");
                a[i][j] = sc.nextInt();
            }
        }

        for (int[] ints : a) {
            for (int anInt : ints) {
                System.out.print(anInt + " | ");
            }
            System.out.println();
        }

    }

}
