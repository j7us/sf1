package org.example;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        //тестовый код, чтобы не переносить все условности из реального проекта

        SmsNotification smsNotification = new SmsNotification("Необходимо пополнить карту с номером 2500 **** ***** ****");

        // логика отправки
        boolean sendSuccess = ThreadLocalRandom.current().nextBoolean();

        SmsNotification nextSmsNotification = sendSuccess
                ? smsNotification.setSendStatus()
                : smsNotification.setCancelStatus();

        System.out.println(nextSmsNotification);
    }
}