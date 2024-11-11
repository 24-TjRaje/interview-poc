package com.interview.interview_poc;

public class Name implements Cloneable{

    private int nameId;
    private String firstName;
    private String lastName;

    public Name(int nameId, String firstName, String lastName) {
        this.nameId = nameId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getNameId() {
        return nameId;
    }

    public void setNameId(int nameId) {
        this.nameId = nameId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Name{" +
                "nameId=" + nameId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public Name clone() {
        Name clone = new Name(this.nameId, this.firstName, this.lastName);
            return clone;
    }
}
