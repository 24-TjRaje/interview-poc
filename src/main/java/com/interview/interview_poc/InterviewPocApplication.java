package com.interview.interview_poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class InterviewPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterviewPocApplication.class, args);

		System.out.println("** Immutable Class **");

		//Addition/Removal to a list created using List.of() will throw
		//UnsupportedOperationException since list is being created using
		// factory method. They are shallow immutable meaning if reference is
		//passed, its vals can be modified. So use the new operator

		List<String> skillSet = new ArrayList<>();
		skillSet.add("Java");

		StudentImmutable s1 = new StudentImmutable("Tejas", 24, skillSet);
		System.out.println(s1.getAge());
		System.out.println(s1.getName());
		System.out.println(s1.getSkills());

		List<String> skills1 = s1.getSkills();
		skills1.add("Flutter");

		System.out.println(s1.getSkills());

	}

}
