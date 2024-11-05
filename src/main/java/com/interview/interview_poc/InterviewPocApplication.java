package com.interview.interview_poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class InterviewPocApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(InterviewPocApplication.class, args);
		Integer[] input = new Integer[] {1,3,0,98,0,5,6,0,4,4,2,0,1};
		System.out.println(Arrays.toString(input));
		System.out.println(SwapLeftRight.swapToLeft(input, 0, "right"));
		System.out.println(SwapLeftRight.swapToLeft(input, 1, "left"));
		System.out.println(SwapLeftRight.swapToLeft(input, 1, "centre"));

	}

}
