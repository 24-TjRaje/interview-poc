package com.interview.interview_poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InterviewPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterviewPocApplication.class, args);

		//Comparing primitives. Equals doesnt work for primitives

		int a = 1, b = 1, c = 2;
		System.out.println("a : " + a + " b : " + b + " c : " + c);
		System.out.println(" Int primitive ; a == b ? ");
		System.out.println(a==b);
		System.out.println(" Int primitive ; a == c ? ");
		System.out.println(a==c);

		// Comparing Objects with == and equals; both are equal because in object class
		// both == and equals() check for reference of objects in memeory

		Object o1 = true;
		Object o2 = true;

		System.out.println("Comparing Object equalities");
		System.out.println("o1 == o2 " + String.valueOf(o1 == o2));
		System.out.println("o1 equals o2 " + String.valueOf(o1.equals(o2)));

		// Comparing Wrapper class Integer, for == it will check if references of
		// object in memeory is same and equals() check if content as same;

		Integer i1 = 10;
		Integer i2 = 10;
		Integer i3 = new Integer(10);

		System.out.println("Comparing Integer(Wrapper) equalities");
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));
		System.out.println(i2 == i3);
		System.out.println(i2.equals(i3));

		//String Compare : same as Integer/wrapper class. new keyword will always create new
		//obj in memory, instead of ceckingnif obj exist and if yes give refrence to it

		String s1 = "Tejas";
		String s2 = "Tejas";
		String s3 = new String("Tejas");

		System.out.println("Comparing String equalities");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));

		//Comparision for Custom classes; without overriding the equals() method.
		// == checks reference equality and if new is used they will never be same
		// Default implemtation inherited from Object class is same as == .

		Student stud1 = new Student(1,"Tejas");
		Student stud2 = new Student(1,"Tejas");
		Student stud3 = stud1;

		System.out.println(stud1 == stud2);
		System.out.println(stud1.equals(stud2));
		System.out.println(stud1 == stud3);
		System.out.println(stud1.equals(stud3));
		System.out.println(stud3 == stud2);
		System.out.println(stud3.equals(stud2));

		//Overiding the equals of custom class as per our need

		System.out.println("Comparing Custom equalities after override");

		StudentEq eq1 = new StudentEq(2,"Dan");
		StudentEq eq2 = new StudentEq(2, "Dan");
		StudentEq eq3 = eq1;

		System.out.println(eq1==eq2);
		System.out.println(eq1.equals(eq2));

		System.out.println(eq2==eq3);
		System.out.println(eq2.equals(eq3));
	}
}