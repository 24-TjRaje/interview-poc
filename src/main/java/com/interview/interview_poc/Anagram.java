package com.interview.interview_poc;

import java.util.*;
import java.util.stream.Collectors;

public class Anagram {

    public static Boolean checkAnagram(String one, String two) {

        //1. use string.split(""),  to split string to individual characters in a list of String
        List<String> listOne = List.of(one.split(""));
        List<String> listTwo = List.of(two.split(""));

        //2. use containsAll() on both the list and check if there length is same.
        return listTwo.containsAll(listOne) && listOne.containsAll(listTwo)
                && (listOne.size() == listTwo.size());
    }

    public static boolean checkAnagramTwo(String one, String two) {

        //1. split the strings into the character array using .toCharArray();
        char[] charOne = one.toCharArray();
        char[] charTwo = two.toCharArray();

        //2. Use Arrays.sort(char[]) to sort both the arrays
        Arrays.sort(charOne);
        Arrays.sort(charTwo);

        //3. Use the Arrays.equals(arr1, arr2) if they are equal.
        return Arrays.equals(charOne, charTwo);
    }
}
