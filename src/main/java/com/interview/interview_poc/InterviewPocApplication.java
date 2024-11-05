package com.interview.interview_poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;

@SpringBootApplication
public class InterviewPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterviewPocApplication.class, args);
		HashMap<String, Integer> input = HashOps.populateHashMap();
		HashOps.iterateUsingEntrySet(input);
		HashOps.iterateUsingIterator(input);
		HashOps.iteratorUsingStream(input);
	}

}
