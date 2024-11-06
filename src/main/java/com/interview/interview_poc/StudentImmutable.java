package com.interview.interview_poc;

import java.util.ArrayList;
import java.util.List;

public final class StudentImmutable {

    private final String name;
    private final Integer age;
    private final List<String> skills;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public List<String> getSkills() {
        return new ArrayList<>(this.skills);
        //return skills;
        //comment first line and uncomment second and then this list is no more mutable
    }

    public StudentImmutable(String name, Integer age, List<String> skills) {
        this.name = name;
        this.age = age;
        this.skills = skills;
    }

    public final void studentDetails() {
        System.out.println("Hello my name is " + this.name +" and I am "
        + age + " years old!");
    }


}
