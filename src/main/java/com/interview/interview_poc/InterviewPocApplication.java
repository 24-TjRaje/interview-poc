package com.interview.interview_poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InterviewPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterviewPocApplication.class, args);
		String s1 = "A man a plan a canal Panama", s2 = "Laral";
		System.out.println(s1 + " " + s2);
		System.out.println(StringReversalOps.reverse2(s1) + " " + StringReversalOps.reverse2(s2));
		System.out.println("Are palindrome? : " + StringReversalOps.isPalindrome(s1));
		System.out.println("Are palindrome? : " + StringReversalOps.isPalindrome(s2));
		System.out.println("Are palindrome? : " + StringReversalOps.isPalindromeWithSymbols(s1));
	}

}
