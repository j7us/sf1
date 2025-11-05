package org.example;

/**
 * Класс для отслеживания статуса СМС-уведомлении, которое должно сформироваться,
 * после чего статус уведомления меняется в зависимости от этапа.
 */
public final class SmsNotification {
    private final String status;
    private final String message;

    public SmsNotification(String message) {
        this.status = "CREATED";
        this.message = message;
    }

    private SmsNotification(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public SmsNotification setSendStatus() {
        return new SmsNotification("SENT", message);
    }

    public SmsNotification setReceiveStatus() {
        return new SmsNotification("RECEIVED", message);
    }

    public SmsNotification setCancelStatus() {
        return new SmsNotification("CANCEL", message);
    }
}
