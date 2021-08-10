package com.redhat.training.ad364.model;

import java.util.List;
import java.util.Objects;

public class Student {
    private String name;
    private Boolean eligibleForFinanceAid;
    private Boolean appliedForFinanceAid;
    private List<Grade> grades;

    public Student() {}

    public Student(String name, List<Grade> grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getEligibleForFinanceAid() {
        return eligibleForFinanceAid;
    }

    public void setEligibleForFinanceAid(Boolean eligibleForFinanceAid) {
        this.eligibleForFinanceAid = eligibleForFinanceAid;
    }

    public Boolean getAppliedForFinanceAid() {
        return appliedForFinanceAid;
    }

    public void setAppliedForFinanceAid(Boolean appliedForFinanceAid) {
        this.appliedForFinanceAid = appliedForFinanceAid;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }

    //  @Override
    //  public boolean equals(Object o) {
    //      if (this == o) return true;
    //      if (o == null || getClass() != o.getClass()) return false;
    //      Student student = (Student) o;
    //      return Objects.equals(name, student.name);
    //  }

    //  @Override
    //  public int hashCode() {
    //      return Objects.hash(name);
    //  }
}
