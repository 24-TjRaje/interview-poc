package com.interview.interview_poc;

public class StudentEq extends Student {

    public StudentEq(Integer id, String name) {
        super(id, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof StudentEq))
            return false;
        else {
            StudentEq studentEq = (StudentEq) obj;
            return (this.getId().equals(studentEq.getId()) &&
                    this.getName().equals(studentEq.getName()));
        }
    }
}
