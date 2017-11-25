package com.example.zahangiralam.model;

/**
 * Created by Zahangir Alam on 2017-11-25.
 */

public class Student {
    private String studentName;
    private String studentId;
    private Address studentAddress;

    public Student() {
    }

    public Student(String studentName, String studentId, Address studentAddress) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentAddress = studentAddress;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Address getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(Address studentAddress) {
        this.studentAddress = studentAddress;
    }
}
