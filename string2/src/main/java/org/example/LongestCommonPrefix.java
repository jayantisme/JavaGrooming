package org.example;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int n = strs.length;
        String start = strs[0];
        String end = strs[n - 1];
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < start.length(); i++) {
            if (start.charAt(i) != end.charAt(i))
                break;
            sb.append(start.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(LongestCommonPrefix.longestCommonPrefix(strs));
    }
}

