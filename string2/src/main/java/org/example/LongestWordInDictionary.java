package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestWordInDictionary {
    public static String longestWord(String[] words) {
        Arrays.sort(words);
        Set<String> set = new HashSet<>();
        String result = "";
        for (String x : words) {
            if (x.length() == 1) {
                set.add(x);
                if (result.length() < x.length()) result = x;
            } else {
                String subStr = x.substring(0, x.length() - 1);
                if (set.contains(subStr)) {
                    set.add(x);
                    if (result.length() < x.length()) result = x;

                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] words = {"a", "banana", "app", "appl", "apply", "apple", "ab", "abl", "abc", "ap"};
        System.out.println(LongestWordInDictionary.longestWord(words));
    }
}
