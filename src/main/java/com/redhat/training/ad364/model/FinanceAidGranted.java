package com.redhat.training.ad364.model;

public class FinanceAidGranted {
    private Student student;

    public FinanceAidGranted() {}

    public FinanceAidGranted(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
