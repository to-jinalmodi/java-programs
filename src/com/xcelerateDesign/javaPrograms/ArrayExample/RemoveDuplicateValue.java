package com.xcelerateDesign.javaPrograms.arrayExample;

import java.util.*;

/*
Write a program to remove duplicate values from an arraylist.
 */
public class RemoveDuplicateValue {

    public static void main(String[] args) {

        List<String> arrayList = Arrays.asList("John", "Bob", "zoya", "John", "steven", "John", "Kevin");

        Set<String> set = new LinkedHashSet<>(arrayList);

        System.out.print(set);

    }

}
