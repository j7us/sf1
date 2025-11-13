package org.example;

import org.example.dto.PayInfo;
import org.example.dto.PaymentResult;

public class AutopayIdemponetChecker extends IdemponetCheckerDecorator<PayInfo, PaymentResult> {

    public AutopayIdemponetChecker(Job<PayInfo, PaymentResult> job) {
        super(job);
    }

    @Override
    protected boolean checkProcessed(PayInfo payInfo) {
        System.out.println("Проверяем по id в бд");
        return true;
    }
}
