package com.interview.interview_poc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIterationOps {

    public static List<String> countries() {
        List<String> countries = new ArrayList<>();
        countries.add("India");
        countries.add("Australia");
        countries.add("Japan");
        countries.add("Russia");
        countries.add("Brazil");
        countries.add("South Africa");
        countries.add("Germany");
        countries.add("Fiji");
        countries.add("Cuba");
        return countries;
    }

    public static void iterateFor(List<String> countries) {
        System.out.println("Iterating using for loop : ");
        for(int i=0; i< countries().size(); i++)
            System.out.println(countries.get(i));
    }

    public static void iterateEnhancedFor(List<String> countries) {
        System.out.println("Iterating using Enhanced for loop :");
        for(String s : countries)
            System.out.println(s);
    }

    public static void iterateIterator(List<String> countries) {
        System.out.println("Iterating using Basic Iterator :");
        Iterator<String> iterator = countries.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());
    }

    public static void iterateListIterator(List<String> countries) {
        System.out.println("Iterating using List Iterator :");
        ListIterator<String> iterator = countries.listIterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());
    }

    public static void iterateForEach(List<String> countries) {
        System.out.println("Iterating using for Each :");
        countries.forEach(country -> System.out.println(country));
    }

    public static void iterateParallel(List<String> countries) {
        System.out.println("Iterating using Parallel Stream :");
        countries.stream().parallel().forEach(country -> System.out.println(country));
    }
}
