package com.interview.interview_poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collection;
import java.util.List;

@SpringBootApplication
public class InterviewPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterviewPocApplication.class, args);

//		List<List<String>> categorisedCountry = FlatMapOps.populateCountries();
//		System.out.println("Before flatMapping : " + categorisedCountry);
//
//		System.out.println("After flatMapping : " + FlatMapOps.allCountries(categorisedCountry));
//
//		System.out.println("Example where the paramter types are different");
//		List<List<?>> mixedData = FlatMapOps.mixedList();
//		System.out.println("Before flatMapping : " + mixedData);
//
//		System.out.println("After flatMapping : " + FlatMapOps.mixedData(mixedData));

		System.out.println("Example where the collection types are different");
		List<Collection<?>> mixedCollection = FlatMapOps.mixedCollection();
		System.out.println("Before flatMapping : " + mixedCollection);

		System.out.println("After flatMapping : " + FlatMapOps.mixedCollectionData(mixedCollection));
	}

}
