package com.interview.interview_poc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InterviewPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterviewPocApplication.class, args);
	}

	@Bean
	public CommandLineRunner runField(ClassA a) {
		return args -> {
			a.message();
			a.getClassB().greet();
			a.getClassC().greet();
			a.getClassD().greet();
		};
	}
}
