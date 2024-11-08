package com.interview.interview_poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InterviewPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterviewPocApplication.class, args);

		int a = 10;
		boolean b = true;

		Integer a1 = a;
		Boolean b1 = b;

		System.out.println("Autoboxing");
		System.out.println(a1.getClass() + " : " + a1);
		System.out.println(b1.getClass() + " : " + b1);

		int a2 = a1;
		boolean b2 = b1;

		System.out.println("Unboxing");
		System.out.println(a2);
		System.out.println(b1);

		System.out.println("Manual autoboxing");
		Integer i = Integer.valueOf(10);
		Character c = Character.valueOf('c');

		System.out.println(i + " " + c);

		int ip = i.intValue();
		char cp = c.charValue();

		System.out.println(ip + " " + cp);

		System.out.println("Equals issue :");

		Integer int1 = 100;
		Integer int2 = 100;

		System.out.println(int1 + " == " + int2 + " ? " + (int1 == int2));
		System.out.println(int1 + " equals " + int2 + " ? " + (int1.equals(int2)));

		int1 = 254; int2 = 254;
		System.out.println(int1 + " == " + int2 + " ? " + (int1 == int2));
		System.out.println(int1 + " equals " + int2 + " ? " + (int1.equals(int2)));

		Long l1 = 10000l;
		Long l2 = 10000l;

		System.out.println(l1 + " == " + l2 + " ? " + (l1 == l2));
		System.out.println(l1 + " equals " + l2 + " ? " + (l1.equals(l2)));

		l1 = 88888l; l2 = 88888l;
		System.out.println(l1 + " == " + l2 + " ? " + (l1 == l2));
		System.out.println(l1 + " equals " + l2 + " ? " + (l1.equals(l2)));
	}
}
