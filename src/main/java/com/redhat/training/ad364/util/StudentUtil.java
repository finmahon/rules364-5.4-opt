package com.redhat.training.ad364.util;

import com.redhat.training.ad364.model.Grade;
import com.redhat.training.ad364.model.Student;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentUtil {
    public static Student createStudent(String name, int ...grades) {
        String[] classNames = {"AD101", "AD102", "CS223", "MATH225", "MATH300", "EE223"};
        Iterator<String> classNameIter = Stream
                .iterate(0, n -> (n + 1)%classNames.length)
                .map(n -> classNames[n]).iterator();

        List<Grade> gradeList = Arrays.stream(grades)
                .boxed()
                .map(grade -> new Grade(grade, classNameIter.next()))
                .collect(Collectors.toList());

        return new Student(name, gradeList);
    }

    public static Student createAimeStudent() {
        return createStudent("Aime", 1, 1, 2, 3, 2, 1, 1, 1);
    }

    public static Student createJonahStudent() {
        return createStudent("Jonah", 1, 4, 5, 5, 4, 1, 1, 1);
    }
}
