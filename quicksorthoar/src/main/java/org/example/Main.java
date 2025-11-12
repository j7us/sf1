package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] test = {1,5,14,7,3,327,3,2};
        quickSort(test);

        System.out.println(Arrays.toString(test));
    }

    private static void quickSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException();
        }

        sort(arr, 0, arr.length - 1);
    }

    private static void sort(int[] arr, int begin, int end) {
        if (begin >= end) {
            return;
        }

        int pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        sort(arr, begin, i-1);
        sort(arr, i+1, end);
    }
}