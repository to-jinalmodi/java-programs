package com.xcelerateDesign.javaPrograms;

import java.util.Scanner;

/**
 * A leap year is a year with 366 days instead of 365; every 4 years in February one extra day is added. This is done because one year doesn't contain 365 days but 365.25 days. By adding once in the 4 years one extra additional day this problem is solved.
 *
 * Any year that is divisible by 4 is a leap year, such as 2016, 2020, 2024, 2028.
 *
 * Note: The above rule does not apply to century years.
 *
 * Centuries such as 1900 and 2000 only have a leap day if they are divisible by 400.
 * 1900 is divisible by 4 and also by 100, but not by 400, so not a leap year.
 * This means that centuries are only a leap year if they are divisible by 400.
 *
 * So 1900 is not, 2000 is, 2100, 2200, 2300 is not, but 2400 is another leap year.
 */
public class LeapYear {

    public static void main(String[] args) {

        //Declarations
        int year;
        Scanner sc = new Scanner(System.in);

        // Scan year from user
        System.out.print("Enter year :");
        year = sc.nextInt();

        int value = year;
        if (value % 100 == 0) {
            value = value / 100;
        }
        if ( value % 4 == 0) {
            System.out.println(year + " is a leap year");
        }
        else {
            System.out.println(year + " is not a leap year");
        }

   }

}
