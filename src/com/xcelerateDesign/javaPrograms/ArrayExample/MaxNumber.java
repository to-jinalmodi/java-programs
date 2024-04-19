package com.xcelerateDesign.javaPrograms.arrayExample;

/**
 * Find the maximum value from an integer array.
 */
public class MaxNumber {

    public static void main(String[] args) {

        int[] array = {3, 11, 5, 40, 2};
        // Default first value is max
        int maxNumber = array[0];

        for (int index : array) {
            if (maxNumber < index) {
                maxNumber = index;
            }
        }

        System.out.println("The max number is: " + maxNumber);

    }

}
