package org.example;

import java.util.List;

public class GradeCalculator {

    public double calculateAverage(List<Integer> grades) {
        if (grades == null || grades.size() == 0) {
            throw new IllegalArgumentException("grades cannot be null or empty");
        }

        double sum = 0;

        for (Integer grade : grades) {
            if (grade == null || grade <= 0) {
                throw new IllegalArgumentException("grade cannot be negative");
            }

            sum += grade;
        }

        return sum / grades.size();
    }
}
