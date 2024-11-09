package com.interview.interview_poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class InterviewPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterviewPocApplication.class, args);

		int[] a = {38, 41, 95, 87, 7, 9 , 21, 42, 96, 83};
		System.out.println(SpecificMaxOps.nthMax(a, 1));
	}

}
