package org.example;

import org.example.dto.PayInfo;
import org.example.dto.PaymentResult;

public class AutopayJob extends Job<PayInfo, PaymentResult> {

    @Override
    public PaymentResult execute(PayInfo payInfo) {
        System.out.println("Происходит обработка");
        return new PaymentResult();
    }
}
