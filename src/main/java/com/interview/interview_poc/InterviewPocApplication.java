package com.interview.interview_poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InterviewPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterviewPocApplication.class, args);

		String s1 = "Hello";
		String s2 = "Hello";
		System.out.println(s1==s2);
		System.out.println("Is s1.equals(s2)? : " + s1.equals(s2));

		String s3 = new String("Hello");
		String s4 = new String("Hello");
		System.out.println(s3==s4);
		System.out.println("Is s3.equals(s4)? : " + s3.equals(s4));

		String s5 = s1;
		System.out.println(s5 == s1);
		System.out.println(s5 == s3); // s3 in heap s5 in SCP

		String s6 = s3.intern(); // intern checks if s3 content literal is present in SCP
		System.out.println(s6 == s1);
	}

}
