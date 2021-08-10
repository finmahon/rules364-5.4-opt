package com.redhat.training.ad364.model;

public class Grade {
    private String classId;
    private int grade;

    public Grade() {}

    public Grade(int grade, String classId) {
        this.grade = grade;
        this.classId = classId;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
