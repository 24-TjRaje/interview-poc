package com.interview.interview_poc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringReversalOps {

    public static String reverse1(String input) {
        String output = "";
        for(char c : input.toCharArray())
            output = c + output;
        return output;
    }

    public static String reverse2(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }

    public static boolean isPalindrome(String input) {
        return input.equalsIgnoreCase(reverse2(input));
    }

    public static boolean isPalindromeWithSymbols(String input) {
        String cleaned = input.replaceAll("[\\W]", "");
        return cleaned.equalsIgnoreCase(reverse2(cleaned));
    }
}
