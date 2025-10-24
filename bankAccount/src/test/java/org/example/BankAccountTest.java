package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BankAccountTest {

    @Test
    public void testBankAccount() {
        BankAccount bankAccount = new BankAccount(1444);

        bankAccount.deposit(100);

        bankAccount.withdraw(50);
        bankAccount.deposit(200);
        bankAccount.withdraw(5000);

        double balance = bankAccount.getBalance();

        assertThat(balance).isLessThan(0);
    }
}
