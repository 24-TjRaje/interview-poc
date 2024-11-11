package com.interview.interview_poc;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {

        //Input data setup
        System.out.println("Clone demo");
        Name nameS1 = new Name(22, "Tejas", "Raje");
        Student s1 = new Student(1, nameS1, true);

        //Shallow clones:

        System.out.println("Original object s1 : " + s1);
        Student s2 = (Student) s1.clone();
        System.out.println("Clone object s2 : " + s2);

        //Modifying values of clone object

        s2.setId(10);
        s2.setPresent(false);
        s2.getName().setLastName("Wick");
        s2.getName().setNameId(24);

        System.out.println("After modifying clone object s2 with id 10 and lastName as Wick" +
                "and prim. fields like nameId to 24 and isPresent to false");
        System.out.println("Original object s1 : " + s1);
        System.out.println("Clone object s2 : " + s2);
    }
}
