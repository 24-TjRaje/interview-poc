package com.interview.interview_poc;

import com.interview.interview_poc.services.ConditionalInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InterviewPocApplication {

	@Autowired
	private ConditionalInterface conditionalInterface;

	public static void main(String[] args) {
		SpringApplication.run(InterviewPocApplication.class, args);
	}
}
