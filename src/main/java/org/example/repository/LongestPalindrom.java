package org.example.repository;

import javax.xml.transform.Result;

public class LongestPalindrom {
    public static void main(String[] args) {
        String str="forgeeksskeegfor";
        Result result=longestPalindrome(str);
        System.out.println("Longest Palindrome: "+result.palindrome);
        System.out.println("Length: "+result.length);
    }
    public static Result longestPalindrome(String str) {
        if (str == null || str.length() == 0) {
            return new Result("", 0);
        }
        String maxPalindrome = "";

        for (int i = 0; i < str.length(); i++) {

            String oddPalindrome = expandAroundCenter(str, i, i);
            if (oddPalindrome.length() > maxPalindrome.length()) {
                maxPalindrome = oddPalindrome;
            }

            String evenPalindrome = expandAroundCenter(str, i, i + 1);
            if (evenPalindrome.length() > maxPalindrome.length()) {
                maxPalindrome = evenPalindrome;
            }
        }

        return new Result(maxPalindrome, maxPalindrome.length());
    }

    private static String expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }

    static class Result {
        String palindrome;
        int length;

        Result(String palindrome, int length) {
            this.palindrome = palindrome;
            this.length = length;
        }
    }
}
