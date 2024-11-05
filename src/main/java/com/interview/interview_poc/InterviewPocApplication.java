package com.interview.interview_poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InterviewPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterviewPocApplication.class, args);

		System.out.println(Anagram.checkAnagram("The eyes", "They see"));
		System.out.println(Anagram.checkAnagram("race", "acer"));
		System.out.println(Anagram.checkAnagram("The eyes", "They se"));
		System.out.println(Anagram.checkAnagram("evil", "vilen"));
		System.out.println(Anagram.checkAnagram("john", "najh"));
		System.out.println(Anagram.checkAnagram("a a", "b b"));
		System.out.println(Anagram.checkAnagram("aa","aaa"));

		System.out.println(Anagram.checkAnagramTwo("The eyes", "They see"));
		System.out.println(Anagram.checkAnagramTwo("race", "acer"));
		System.out.println(Anagram.checkAnagramTwo("The eyes", "They se"));
		System.out.println(Anagram.checkAnagramTwo("evil", "vilen"));
		System.out.println(Anagram.checkAnagramTwo("john", "najh"));
		System.out.println(Anagram.checkAnagramTwo("a a", "b b"));
		System.out.println(Anagram.checkAnagramTwo("aa","aaa"));






	}

}
