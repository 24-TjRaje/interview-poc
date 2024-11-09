package com.interview.interview_poc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SpecificMaxOps {

    public static Integer nthMax(int[] input, int nth) {

        if(nth<1)
            return -1;

        List<Integer> a = IntStream.of(input)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));

        return a.stream().distinct()
                .sorted(Comparator.reverseOrder())
                .skip(nth-1).findFirst().orElse(0);
    }
}
