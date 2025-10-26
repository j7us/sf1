package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GradeCalculatorTest {

    @Test
    void testAvg() {
        GradeCalculator gradeCalculator = new GradeCalculator();

        List<Integer> grades = Arrays.asList(1, 2, 3);

        double res = gradeCalculator.calculateAverage(grades);

        assertThat(res).isEqualTo(2);
    }

    @Test
    void testAvgNegative() {
        GradeCalculator gradeCalculator = new GradeCalculator();
        List<Integer> grades = Arrays.asList(1, 2, -1, 3);

        try {
            gradeCalculator.calculateAverage(grades);
        } catch (Exception e) {
            assertThat(e).isInstanceOf(IllegalArgumentException.class);
        }
    }

    @Test
    void testAvgNullValue() {
        GradeCalculator gradeCalculator = new GradeCalculator();
        List<Integer> grades = Arrays.asList(1, 2, null, 3);

        try {
            gradeCalculator.calculateAverage(grades);
        } catch (Exception e) {
            assertThat(e).isInstanceOf(IllegalArgumentException.class);
        }
    }

    @Test
    void testAvgNullList() {
        GradeCalculator gradeCalculator = new GradeCalculator();

        try {
            gradeCalculator.calculateAverage(null);
        } catch (Exception e) {
            assertThat(e).isInstanceOf(IllegalArgumentException.class);
        }
    }

    @Test
    void testAvgEmptyList() {
        GradeCalculator gradeCalculator = new GradeCalculator();

        try {
            gradeCalculator.calculateAverage(new ArrayList<>());
        } catch (Exception e) {
            assertThat(e).isInstanceOf(IllegalArgumentException.class);
        }
    }
}
