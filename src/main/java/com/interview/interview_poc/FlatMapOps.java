package com.interview.interview_poc;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class FlatMapOps {

    public static List<String> asianCountries() {
        return List.of("India", "Japan", "Israel", "Phillipines", "Russia");
    }

    public static List<String> africanCountries() {
        return List.of("Ghana", "Uganda", "Zimbabwe", "South Africa"
                , "Mauritius");
    }

    public static List<String> europeanCountries() {
        return List.of("Germany", "Italy", "Greece", "Austria", "Sweden");
    }

    public static List<String> americanCountries() {
        return List.of("Brazil", "Argentina", "Chile", "Mexico", "Bolivia");
    }

    public static List<List<String>> populateCountries() {
        return List.of( asianCountries(), africanCountries(), europeanCountries(),
                americanCountries());
    }

    public static List<String> allCountries(List<List<String>> divCountries) {
        return divCountries.stream().flatMap(List::stream).toList();
    }

    public static List<Integer> numberList() {
        return List.of(22, 26, 32, 33, 44, 46, 50);
    }

    public static List<Double> doubleList() {
        return List.of(160.8, 161.1, 161.3);
    }

    public static List<List<?>> mixedList() {
        return List.of(allCountries(populateCountries()), numberList(), doubleList());
    }

    public static List<?> mixedData(List<List<?>> mixed) {
        return mixed.stream().flatMap(List::stream).toList();
    }

    public static List<Collection<?>> mixedCollection() {
        return List.of(allCountries(populateCountries()), new HashSet<>(doubleList()));
    }

    public static List<?> mixedCollectionData(List<Collection<?>> mixedCollection) {
        return mixedCollection.stream().flatMap(Collection::stream).toList();
    }
}
