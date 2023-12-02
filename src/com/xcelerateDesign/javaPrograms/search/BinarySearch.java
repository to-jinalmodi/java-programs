package com.xcelerateDesign.javaPrograms.search;

/**
 * Binary Search is defined as a searching algorithm used in a sorted array by repeatedly dividing the search interval in half.
 * The idea of binary search is to use the information that the array is sorted and reduce the time complexity to O(log N).
 */
public class BinarySearch {

    public static void binarySearch(int[] arr, int first, int last, int key) {

        int mid = (first + last) / 2;
        while (first <= last) {
            if (arr[mid] < key) {
                first = mid + 1;
            } else if (arr[mid] == key) {
                System.out.println("Element " + key + " is found at index: " + mid);
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Element " + key + " is not found!");
        }

    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int key = 40;
        int last = arr.length - 1;
        binarySearch(arr, 0, last,key);

    }

}
