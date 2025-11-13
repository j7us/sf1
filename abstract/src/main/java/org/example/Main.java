package org.example;

import org.example.dto.PayInfo;
import org.example.dto.PaymentResult;

public class Main {
    public static void main(String[] args) {
        Job<PayInfo, PaymentResult> autopayJob = new AutopayJob();

        Job<PayInfo, PaymentResult> autopayIdemponetChecker = new AutopayIdemponetChecker(autopayJob);

        autopayIdemponetChecker.execute(new PayInfo());
    }
}