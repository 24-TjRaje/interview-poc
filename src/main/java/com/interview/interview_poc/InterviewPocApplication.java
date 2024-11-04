package com.interview.interview_poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static com.interview.interview_poc.DuplicateArrayElements.*;

@SpringBootApplication
public class InterviewPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterviewPocApplication.class, args);

		Integer[] input = new Integer[] {1,2,1,3,45,56,5,5,6,4,2};
		//Integer[] input = new Integer[] {1,2,3,4};
		//Integer[] input = new Integer[] {11,11};

		System.out.println(removeDuplicates(input));
		System.out.println(removeDuplicatesInteger(input));

		String inputSentence = "The quick brown fox jumps over the lazy dog the quick brown fox";
		System.out.println(removeDuplicatesStringSensitive(inputSentence));
	}


}
