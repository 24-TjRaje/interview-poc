package com.interview.interview_poc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassA {

    @Autowired
    private ClassB classB;

    @Autowired(required = false)
    private ClassE classE;

    private ClassC classC;

    private ClassD classD;

    @Autowired
    public ClassA(ClassC classC) {
        this.classC = classC;
    }

    public void message() {
        System.out.println("Hello from Class A");
    }

    public ClassB getClassB() {
        return classB;
    }

    public ClassC getClassC() {
        return classC;
    }

    public ClassD getClassD() {
        return classD;
    }

    @Autowired
    public void setClassD(ClassD classD) {
        this.classD = classD;
    }
}
