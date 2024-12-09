package com.interview.interview_poc;

public class Child extends Parent{

    public Child() {
        System.out.println("In child onstructor");
    }
    public void introChild() {
        System.out.println("Hello. I'm the Child class");
    }

    public void sign1(int i) {
        System.out.println(" A method with int args. Passed arg : " + i);
    }

    public void sign1(float f) {
        System.out.println(" A method with float args. Passed arg : " + f);
    }

    public void earlyPoly(String s) {
        System.out.println("This is a String version");
    }

    public void earlyPoly(Object o) {
        System.out.println("This is a Object version");
    }

    public void conflictPart2(Integer i) {
        System.out.println("This is Integer version");
    }

    public void conflictPart2(Long l) {
        System.out.println("This is Long version");
    }

    public void argInt(int i) {
        System.out.println("Single int arg version");
    }

    public void argInt(int i, int i1) {
        System.out.println("Double int arg version");
    }

    public void argInt(int...i) {
        System.out.println("Var args int arg version");
    }

    @Override
    public void yourVehicle() {
        System.out.println("You will inherit Karizma XMR");
    }
}
