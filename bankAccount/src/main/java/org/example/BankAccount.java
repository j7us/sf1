package org.example;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amountIsNegative(amount)) {
            throw new IllegalArgumentException("Сумма пополнения должна быть больше 0");
        }

        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amountIsNegative(amount)) {
            throw new IllegalArgumentException("Сумма списания должна быть больше 0");
        }

        if (amount > this.balance) {
            return;
        }

        this.balance -= amount;
    }

    public double getBalance() {
        return this.balance;
    }

    private boolean amountIsNegative(double amount) {
        return amount >= 0;
    }
}
