package com.interview.interview_poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InterviewPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterviewPocApplication.class, args);
		String input = "Tejas Devidas Raje";
		System.out.println(CharacterFreqOps.characterFrequency(input));
	}

}
