package com.interview.interview_poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@SpringBootApplication
public class InterviewPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterviewPocApplication.class, args);
		int[] input = new int[] {32, 33, 44, 46, 50, 26, 22, 42, 79, 58, 65, 39, 53};
		//int[] input = new int[] {89,22};
		//int[] input = new int[] {86};
		 //int[] input = new int[] {};
		List<Integer> list = IntStream.of(input).boxed().collect(Collectors.toCollection(ArrayList::new));
		System.out.println(SecondMaxOps.secondMax3(list));
	}
}