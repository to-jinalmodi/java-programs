package com.xcelerateDesign.javaPrograms;

import java.util.Scanner;

/**
 * The {@code CountVowelAndConsonant} program counts the number of vowels
 * and consonants in a given word entered by the user.
 * <p>
 * This program is case-insensitive and treats uppercase and lowercase letters equally.
 * </p>
 *
 * <p>Example usage:</p>
 * <pre>
 * Enter the Word: Hello
 * There are 2 Vowels in the word.
 * There are 3 Consonants in the word.
 * </pre>
 */
public class CountVowelAndConsonant {

    /**
     * The main method is the entry point of the program.
    */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Word: ");
        String str = sc.nextLine();

        int vowelCount = 0;
        int consonantCount = 0;

        // Iterate over each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));

            // Check if the character is a letter before counting
            if (Character.isLetter(ch)) {
                if (isVowel(ch)) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        // Display results
        System.out.println("There are " + vowelCount + " Vowels in the word.");
        System.out.println("There are " + consonantCount + " Consonants in the word.");

        sc.close();
    }

    /**
     * Checks if a given character is a vowel (a, e, i, o, u).
     *
     * @param ch the character to check
     * @return true if the character is a vowel, false otherwise
     */
    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
