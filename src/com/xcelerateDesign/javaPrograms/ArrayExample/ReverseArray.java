package com.xcelerateDesign.javaPrograms.arrayExample;

/**
 * Reverse an array without taking another array.
 */
public class ReverseArray {

    public static void main(String[] args) {

        int[] array = {11, 67, 43, 98, 5};

        System.out.print("Array:");
        for (int index : array) {
            System.out.print(" " + index);
        }

        int temp;
        int length = array.length;
        int mid = length / 2;

        for (int index = 0; index < length; index++) {
            if (index < mid) {
                temp = array[index];
                array[index] = array[length -1 - index];
                array[length -1 - index] = temp;
            }
        }

        System.out.print("\nReverse array:");
        for (int index : array) {
            System.out.print(" " + index);
        }

    }

}
