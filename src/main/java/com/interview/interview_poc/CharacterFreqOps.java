package com.interview.interview_poc;

import java.util.*;
import java.util.stream.Collectors;

public class CharacterFreqOps {

    public static Map<String, Integer> characterFrequency(String input) {
        List<String> inputList = new ArrayList<>(Arrays.asList(input.split("")));
        Map<String, Integer> result = new HashMap<>();
        inputList.stream().forEach(i -> {
            result.put(i, Collections.frequency(inputList, i));
        });
        return result;
    }
}
