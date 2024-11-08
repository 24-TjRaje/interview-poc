package com.interview.interview_poc;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListResourceBundle;
import java.util.stream.Stream;

public class SecondMaxOps {

    public static Integer secondMax1(List<Integer> input) {
        Collections.sort(input);
        if(input.size()>1)
            return input.get(input.size() - 2);
        else
            return 0;
    }

    public static Integer secondMax2(List<Integer> input) {
        Stream<Integer> s = input.stream().sorted(Comparator.reverseOrder()).limit(2);
        return s.min(Comparator.naturalOrder()).orElse(0);
    }

    public static Integer secondMax3(List<Integer> input) {
        return input.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0);
    }
}
