package com.interview.interview_poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InterviewPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterviewPocApplication.class, args);

		int[] a = {4, 11, 3, 10, 7, 9};
		int[] b = {44, 111, 33, 100, 79, 97};
		//int[] b = {4, 11, 3, 10, 7, 9};
		//int[] b = {11, 1, 5, 3, 9, 10};

		System.out.println(SmallestOps.smallestCommon(a,b));
	}

}
