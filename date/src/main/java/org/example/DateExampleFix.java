package org.example;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class DateExampleFix {

    // Вариация с LocalDateTime как просто хранение даты независимо от часового пояса
    public void testLocalDateTime() {
        String dateString = "2024-05-13 14:30:00";
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.parse(dateString, format);
        System.out.println("Date: " + localDateTime);
    }

    // Вариация с LocalDateTime как просто хранение даты независимо от часового пояса
    public void testOffsetDateTime() {
        String dateString = "2024-05-13 14:30:00";
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        OffsetDateTime offsetDateTime = OffsetDateTime.of(LocalDateTime.parse(dateString, format), ZoneOffset.UTC);
        System.out.println("Date: " + offsetDateTime);
    }
}
