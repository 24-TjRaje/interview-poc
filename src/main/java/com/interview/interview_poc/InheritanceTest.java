package com.interview.interview_poc;

public class InheritanceTest {

    public void relationVersion(Parent p) {
        System.out.println("Parent version");
    }

    public void relationVersion(Child c) {
        System.out.println("Child version");
    }


    public static void main(String[] args) {
        System.out.println("Inheritance Demo");

        Parent parent = new Parent();
        Child child = new Child();
        Parent parentRef = new Child();

//        System.out.println("Child class reference cannot be used to hold Parent object " +
//                "It will throw incompatible types - Compile Time Exception " +
//                "Comment below line to see the error");
//        //Child childRef = new Parent();
//
//        parent.introParent();
//        child.introChild();
//        child.introParent();
//        parentRef.introParent();
//        System.out.println("A parent ref can hold child objects but cannot call child methods. " +
//                "If tried , then we get error stating 'cannot find symbol' " +
//                "Uncomment below and check");
//        //parentRef.introChild();
//
//        //rule 1 : automatic promotion
//        child.sign1(10);
//        child.sign1(10.2f);
//        child.sign1('a');
//        System.out.println("JVM will try to invoke method with exact match. If none is found, it will try to " +
//                "promote it to next higher data type. This will continue till a suitable method is found or it " +
//                "will throw error , no suitable method found. Uncomment below and try");
//        //child.sign1(true);
//
//
//        // rule 2 : args value conflict
//        child.earlyPoly("tejas");
//        child.earlyPoly(new Object());
//        child.earlyPoly(null);
//
//        //rule 3 : arg value conflict part2
//        child.conflictPart2(Integer.valueOf(10));
//        child.conflictPart2(Long.valueOf(20l));
//        //child.conflictPart2(null);
//
//        //rule4 :varargs
//        child.argInt(10);
//        child.argInt(10, 20);
//        child.argInt();
//        child.argInt(10,20,30);
//
//        //rule5 :
//        InheritanceTest itc = new InheritanceTest();
//        itc.relationVersion(parent); // parent
//        itc.relationVersion(child); //child
//        itc.relationVersion(parentRef); // parent
//
//        //overriding
//        parent.yourVehicle();
//        child.yourVehicle();
//        parentRef.yourVehicle();
    }
}
