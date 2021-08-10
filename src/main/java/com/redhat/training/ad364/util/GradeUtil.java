package com.redhat.training.ad364.util;

import com.redhat.training.ad364.model.Grade;

import java.util.List;

public class GradeUtil {
    public static double calculateGPA(List<Grade> grades) {
        return grades.stream()
                .mapToDouble(Grade::getGrade)
                .sum() / grades.size();
    }
}
