package com.interview.interview_poc;

public class Student implements Cloneable {

    private Integer id;
    private Name name;
    private boolean isPresent;

    public Student(Integer id, Name name, boolean isPresent) {
        this.id = id;
        this.name = name;
        this.isPresent = isPresent;
    }

    public boolean isPresent() {
        return isPresent;
    }

    public void setPresent(boolean present) {
        isPresent = present;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name=" + name +
                ", isPresent=" + isPresent +
                '}';
    }

    @Override
    public Student clone() {
            Name name = this.getName().clone();
            Student clone = new Student(this.id, name, this.isPresent);
            return clone;
    }
}
