package com.interview.interview_poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.NoSuchElementException;
import java.util.Optional;

@SpringBootApplication
public class InterviewPocApplication {


	public static void main(String[] args) {
		SpringApplication.run(InterviewPocApplication.class, args);

		String input = "Tejas";
		Optional<String> wrap = Optional.of(input);

		String intake = null;
		Optional<String> trap = Optional.ofNullable(intake);

		System.out.println("Input : " + input);
		System.out.println("Intake : " + null);

		System.out.println("Checking if the value exists for Input : " + wrap.isPresent());
		System.out.println("Checking if the value exists for Intake : " + trap.isPresent());

		System.out.println("Checking if the value's empty for Input : " + wrap.isEmpty());
		System.out.println("Checking if the value's empty for Intake : " + trap.isEmpty());

		if(wrap.isPresent())
			System.out.println("Value of wrap/Input is : " + wrap.get() );

		if(trap.isEmpty())
			System.out.println("Value of trap/Intake is empty");

		wrap.ifPresent(value -> System.out.println("Hello. Greetings from " + wrap.get()));

		try {
			System.out.println("Greetings from " + trap.orElseThrow());
		} catch(NoSuchElementException e) {
			System.out.println("Cannot greet you from trap/Intake because " + e.getMessage());
		}

		// If value is absent set default
		System.out.println("Greetings from " + wrap.orElse("unknown"));
		System.out.println("Greetings from " + trap.orElse("unknown"));

	}

}
