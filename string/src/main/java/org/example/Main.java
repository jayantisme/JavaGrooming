package org.example;

import java.util.HashMap;

public class Main {

    // Reverse a string without using jdk api & without extra space.
    public static String reverseString(String str) {
        if (str.length() <= 1) return str;
        StringBuilder sb  =  new StringBuilder();
        for (int i=str.length()-1; i>=0; i--)
            sb.append(str.charAt(i));
        return sb.toString();
    }

    // Find two string is anagram
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map1 = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            if (map.containsKey(s.charAt(i)))
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            else
                map.put(s.charAt(i), 1);
        }
        for(int i=0; i<t.length(); i++) {
            if (map1.containsKey(t.charAt(i)))
                map1.put(t.charAt(i), map1.get(t.charAt(i))+1);
            else
                map1.put(t.charAt(i), 1);
        }
        if (map.equals(map1))
            return true;
        else
            return false;
    }

    // Find a string is palindrome
    public static boolean isPalindrome(String s) {
        int i = 0, j = s.length()-1;
        String str = s.toLowerCase();
        while(i<j) {
            if (!Character.isLetterOrDigit(str.charAt(i)))
                i++;
            else if(!Character.isLetterOrDigit(str.charAt(j)))
                j--;
            else {
                if(str.charAt(i) != str.charAt(j))
                    return false;
                i++;
                j--;
            }
        }
        return true;
    }

    // Remove Palindromic Subsequences
    public int removePalindromeSub(String s) {
        int n = s.length();
        if(n <= 1)
            return n;
        int left = 0, right = n-1;
        while(left < right) {
            if(s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            }
            else
                return 2;
        }
        return 1;
    }

    // Count Number of Vowel
    public int vowelStrings(String[] words, int left, int right) {
        int count=0;
        while(left <= right) {
            char beg=words[left].charAt(0);
            char end=words[left].charAt(words[left].length()-1);
            if((beg=='a'||beg=='e'||beg=='i'||beg=='o'||beg=='u') && (end=='a'||end=='e'||end=='i'||end=='o'||end=='u'))
            {
                count++;
            }
            left++;
        }
        return count;
    }

    // Main Method
    public static void main(String[] args) {
        String str = "jayant";
        System.out.println(reverseString(str));
        System.out.println(isAnagram(str,"ayanjt"));
        System.out.println("Palindrome => "+ isPalindrome(str));
    }
}