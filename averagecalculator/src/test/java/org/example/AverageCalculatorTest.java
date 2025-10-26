package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AverageCalculatorTest {

    @Test
    public void testCalculateAverage() {
        AverageCalculator averageCalculator = new AverageCalculator();
        int[] numbers = {1, 2, 3};

        int avg = averageCalculator.calculateAverage(numbers);

        assertThat(avg).isEqualTo(2);
    }

    @Test
    public void testCalculateAverageFailed() {
        AverageCalculator averageCalculator = new AverageCalculator();

        int avg = averageCalculator.calculateAverage(null);

        assertThat(avg).isEqualTo(0);
    }

    @Test
    public void testCalculateAverageZeroNumbers() {
        AverageCalculator averageCalculator = new AverageCalculator();

        int[] numbers = new int[0];

        int avg = averageCalculator.calculateAverage(numbers);

        assertThat(avg).isEqualTo(0);
    }

    @Test
    public void testCalculateAverageWithNegativeNumbers() {
        AverageCalculator averageCalculator = new AverageCalculator();

        int[] numbers = {-1, -2, -3};

        int avg = averageCalculator.calculateAverage(numbers);

        assertThat(avg).isEqualTo(-2);
    }
}
