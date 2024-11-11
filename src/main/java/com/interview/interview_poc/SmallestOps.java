package com.interview.interview_poc;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SmallestOps {

    public static Integer smallestCommon(int[] a, int[] b) {
        Set<Integer> as = IntStream.of(a).boxed().collect(Collectors.toCollection(
                HashSet::new));

        Set<Integer> bs = IntStream.of(b).boxed().collect(Collectors.toCollection(
                HashSet::new));

        if(Collections.disjoint(as, bs))
            return Collections.min(as);

        return as.stream().sorted().filter(i-> !bs.contains(i)).findFirst().orElse(-1);
    }
}
