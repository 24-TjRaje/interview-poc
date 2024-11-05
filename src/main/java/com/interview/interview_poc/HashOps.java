package com.interview.interview_poc;

import java.util.*;

public class HashOps {

    public static HashMap<String,Integer> populateHashMap() {

        HashMap<String, Integer> studentMap = new HashMap<>();
        studentMap.put("Tejas", 86);
        studentMap.put("Sanket", 72);
        studentMap.put("Swanand", 82);
        studentMap.put("Shahbaz", 88);
        studentMap.put("Mayuresh", 64);
        studentMap.put("Vidhyasagar", 57);

        return studentMap;
    }

    public static void iterateUsingEntrySet(HashMap<String, Integer> input) {

        System.out.println("Iteration using entrySet and for each.");
        Set<Map.Entry<String, Integer>> iterated = input.entrySet();

        for(Map.Entry<String, Integer> entry : iterated){
            System.out.println(" Key : " + entry.getKey() + " - Value : "
            + entry.getValue());
        }
    }

    public static void iterateUsingIterator(HashMap<String,Integer> input) {

        System.out.println("Iteration using Iterator");
        Iterator<Map.Entry<String, Integer>> iterator = input.entrySet().iterator();

        while(iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(" Key : " + entry.getKey() + " - Value : "
                    + entry.getValue());
        }
    }

    public static void iteratorUsingStream(HashMap<String, Integer> input) {

        System.out.println("Iteration using Stream API");
        input.entrySet().forEach( entry -> System.out.println(" Key : " + entry.getKey() + " - Value : "
                + entry.getValue()));
    }


}
