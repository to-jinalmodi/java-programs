package com.xcelerateDesign.javaPrograms.logical;

import java.util.*;

/**
 * An anagram is a word or phrase formed by rearranging the letters in another word or phrase.
 * Display anagram words in form of group.
 * [abc, cab, bac]
 * [pqr, rqp]
 * [xyz]
 */
public class Anagram {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("pqr");
        list.add("cab");
        list.add("bac");
        list.add("xyz");
        list.add("rqp");

        Map<String, List<String>> map = new HashMap<>();
        for(String word : list) {

            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            List<String> valueList = map.get(sortedWord);

            if (valueList == null) {
                List<String> valueListFirst = new ArrayList<>();
                valueListFirst.add(word);
                map.put(word, valueListFirst);
            } else {
                valueList.add(word);
                map.put(sortedWord, valueList);
            }

        }

        for (var entry : map.entrySet()) {
            System.out.println(entry.getValue());
        }

    }

}
