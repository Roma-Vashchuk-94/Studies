package JavaCore.Lesson_21_Annotation_Date.task3;

import java.time.*;
import java.util.Date;

public class DateFormat {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Date: " + date);
        LocalDate localDate = Date_To_LocalDate_Formatter(date);
        System.out.println("Local date: " + localDate);
        LocalTime localTime = Date_To_LocalTime_Formatter(date);
        System.out.println("Local time: " + localTime);
        LocalDateTime localDateTime = Date_To_LocalDateTime_Formatter(date);
        System.out.println("Local date and time: " + localDateTime);
    }

    public static LocalDate Date_To_LocalDate_Formatter(Date date) {
        Instant instant = date.toInstant();
        ZonedDateTime zdt = instant.atZone(ZoneId.systemDefault());
        LocalDate localDate = zdt.toLocalDate();
        return localDate;
    }

    public static LocalTime Date_To_LocalTime_Formatter(Date date) {
        Instant instant = date.toInstant();
        ZonedDateTime zdt = instant.atZone(ZoneId.systemDefault());
        LocalTime localTime = zdt.toLocalTime();
        return localTime;
    }

    public static LocalDateTime Date_To_LocalDateTime_Formatter(Date date) {
        Instant instant = date.toInstant();
        ZonedDateTime zdt = instant.atZone(ZoneId.systemDefault());
        LocalDateTime localDateTime = zdt.toLocalDateTime();
        return localDateTime;
    }
}
