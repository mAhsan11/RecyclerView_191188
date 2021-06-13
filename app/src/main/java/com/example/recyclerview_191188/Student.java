package com.example.recyclerview_191188;


public class Student {
    String StudentName;
    String RollNo;
    int studentImage;

    public Student(String studentName, String rollNo, int studentImage) {
        StudentName = studentName;
        RollNo = rollNo;
        this.studentImage = studentImage;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getRollNo() {
        return RollNo;
    }

    public void setRollNo(String rollNo) {
        RollNo = rollNo;
    }

    public int getStudentImage() {
        return studentImage;
    }

    public void setStudentImage(int studentImage) {
        this.studentImage = studentImage;
    }
}
