package com.interview.interview_poc;

public class StringMutableDemo {

    public static void main(String[] args) {

        String mutable = "John Wick";
        System.out.println("Using string builder");
        StringBuilder sb = new StringBuilder(mutable);
        System.out.println("Before update : " +sb);
        sb.append("Chapter 1");
        System.out.println("After update : " +sb);
        System.out.println("Using string buffer");
        StringBuffer sbf = new StringBuffer(sb);
        System.out.println("Before update : " + sbf);
        sbf.append(" Beginning");
        System.out.println("After update : " + sbf);

        System.out.println("Simple string : " + mutable);
        System.out.println("String builder string : " + sb);
        System.out.println("String Buffer string : " + sbf);

    }
}
