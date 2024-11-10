package com.interview.interview_poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InterviewPocApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(InterviewPocApplication.class, args);
		System.out.println(PrimeOps.isPrime2(1009));
		System.out.println(PrimeOps.isPrime2(71));
		System.out.println(PrimeOps.isPrime2(7103));
		System.out.println(PrimeOps.isPrime2(89));
		System.out.println(PrimeOps.isPrime2(39));
		System.out.println(PrimeOps.isPrime2(17729));
		System.out.println(PrimeOps.isPrimeInBuild(50051));
		System.out.println(PrimeOps.isPrimeInBuild(69365));

	}

}
