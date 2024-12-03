package com.interview.interview_poc;

import java.util.HashMap;
import java.util.Hashtable;

public class HashMapTableDemo {

    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        hashMap.put("Tejas", 1);
        hashMap.put("Raje", 2);
        hashMap.put(null,null);
        hashMap.put("Roman", null);
        System.out.println(hashMap);

        hashtable.put("Tejas", 1);
        hashtable.put("Raje", 2);
        System.out.println(hashtable);

        //hashtable.put("Dan", null);
        hashtable.put(null, 2);

    }
}
