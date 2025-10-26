package org.example;

public class AverageCalculator {

    public int calculateAverage(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }

        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum / numbers.length;
    }
}
