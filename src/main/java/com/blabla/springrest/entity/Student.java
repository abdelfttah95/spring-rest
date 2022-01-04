package com.blabla.springrest.entity;

/**
 *
 * @author abdel
 */
public class Student {

    private String firstName;
    private String LastName;

    public Student() {

    }

    public Student(String firstName, String LastName) {
        this.firstName = firstName;
        this.LastName = LastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

}
