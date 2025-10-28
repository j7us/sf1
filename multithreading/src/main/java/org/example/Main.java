package org.example;

public class Main {
    public static void main(String[] args) {
        RaceConditionExampleFix raceConditionExampleFix = new RaceConditionExampleFix();
        raceConditionExampleFix.test();

        DeadlockExampleFix deadlockExampleFix = new DeadlockExampleFix();
        deadlockExampleFix.test();
    }
}