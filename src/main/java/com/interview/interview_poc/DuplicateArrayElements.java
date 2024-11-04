package com.interview.interview_poc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DuplicateArrayElements {

    // Removes every element that has duplicate
    public static List<Integer> removeDuplicates(Integer[] input) {

        List<Integer> listInput = Arrays.asList(input);

        return listInput.stream()
                .filter(i -> Collections.frequency(listInput,i) == 1)
                .toList();
    }

    // Removes only the duplicates
    public static List<Integer> removeDuplicatesInteger(Integer[] input) {

        return Arrays.asList(input).stream()
                .distinct()
                .toList();
    }

    // Removes every element that has duplicate
    public static List<String> removeDuplicatesStringSensitive(String inputSentence) {

        String[] input = inputSentence.split(" ");
        List<String> listInput = Arrays.asList(input);
        return listInput.stream()
                .filter(s -> Collections.frequency(listInput, s) == 1)
                .toList();
    }
}
