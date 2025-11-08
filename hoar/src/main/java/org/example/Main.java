package org.example;

public class Main {
    public static void main(String[] args) {
        int res = maxWithAbs(-15, 1);

        System.out.println(res);
    }

    private static int maxWithAbs(int a, int b) {
        return max(abs(a), abs(b));
    }

    private static int max(int a, int b) {
        return a >= b ? a : b;
    }

    private static int abs(int a) {
        return a >= 0 ? a : -a;
    }
}