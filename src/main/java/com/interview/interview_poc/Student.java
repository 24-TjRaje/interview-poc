package com.interview.interview_poc;


import java.lang.reflect.InvocationTargetException;
import java.util.function.Supplier;

public class Student implements Cloneable {

    private int id;
    private String name;

    public Student() {

    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        System.out.println("Ways to create objects");

        System.out.println("1. using the new operator");
        Student obj1 = new Student(24, "TJ");
        System.out.println(obj1);

        System.out.println("2. using clone method");
        Student obj2 = obj1.clone();
        System.out.println(obj2);
        System.out.println("Are original and clone same object : " + (obj1==obj2));

        System.out.println("3. using the reflection API");
        Student obj3 = Student.class.getConstructor().newInstance();
        obj3.setId(23);
        obj3.setName("John");
        System.out.println(obj3);

        System.out.println("4. Using Lambda");
        Supplier<Student> imp = Student::new;
        Student obj4 = imp.get();
        obj4.setId(22);
        obj4.setName("Dennis");
        System.out.println(obj4);
    }

    @Override
    public Student clone() {
        try {
            Student clone = (Student) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
