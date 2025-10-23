package org.example;

public class Main {
    public static void main(String[] args) {
        Storage storage = new JdbcStorage();

        storage.save("first");
        storage.save("second");
        storage.save("third");

        String retrieve = storage.retrieve(1);
    }
}