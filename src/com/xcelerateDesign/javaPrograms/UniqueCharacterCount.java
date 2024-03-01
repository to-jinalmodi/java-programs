package com.xcelerateDesign.javaPrograms;

import java.util.*;

/**
 * Given a string 's',the task is to count unique characters.
 */
public class UniqueCharacterCount {

    public static void main(String[] args) {

        String str = "strengths";
        Set<Character> set = new HashSet<>();

        // Splitting string in to character array
        char[] charArray = str.toCharArray();

        // Loop over char array and add all characters in to set - stores unique values
        for (char ch : charArray) {
            set.add(ch);
        }

        // Print unique characters count
        System.out.println(set.size());

        // 2nd way
        Set<Character> set2ndWay = new HashSet<>();
        for (int iCount = 0; iCount < str.length(); iCount++) {
            set2ndWay.add(str.charAt(iCount));
        }

        // Print unique characters count
        System.out.println(set2ndWay.size());

    }

}
