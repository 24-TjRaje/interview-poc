package com.interview.interview_poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class InterviewPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterviewPocApplication.class, args);

		List<String> countries = ListIterationOps.countries();
		ListIterationOps.iterateFor(countries);
		ListIterationOps.iterateEnhancedFor(countries);
		ListIterationOps.iterateIterator(countries);
		ListIterationOps.iterateListIterator(countries);
		ListIterationOps.iterateForEach(countries);
		ListIterationOps.iterateParallel(countries);
	}

}
