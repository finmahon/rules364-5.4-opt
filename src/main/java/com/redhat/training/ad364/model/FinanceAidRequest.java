package com.redhat.training.ad364.model;

public class FinanceAidRequest {
    private Student student;

    public FinanceAidRequest() {}

    public FinanceAidRequest(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
