package de.telran.Melkonov.Oleg.hw20231024;

import java.io.IOException;
import java.text.ParseException;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;
import java.util.*;

public class Dates {
    public static void main(String[] args) throws IOException, ParseException {
        LocalDate createdDate = LocalDate.of(2020, Month.JANUARY, 10);

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(createdDate.format(formatter1));

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(createdDate.format(formatter2));

        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy MMMM dd");
        System.out.println(createdDate.format(formatter3));

        LocalDateTime time = LocalDateTime.now();
        LocalDateTime time1 = LocalDateTime.now().minusHours(10);
        System.out.println(time);
        System.out.println(time1);
        System.out.println(time1.atOffset(ZoneOffset.of("-1000")));

        LocalDate localDate = LocalDate.now();
        TemporalField wom = WeekFields.ISO.weekOfMonth();
        System.out.println(localDate.getDayOfWeek() + "  " + localDate.getDayOfYear() + "  " + localDate.get(wom)
        + "  " + localDate.getMonth());

        Calendar gregorianCalendar = new GregorianCalendar();
        System.out.println(gregorianCalendar.get(Calendar.DAY_OF_WEEK) + " ||| " + gregorianCalendar.get(Calendar.DAY_OF_YEAR)
        + " ||| " + gregorianCalendar.get(Calendar.WEEK_OF_MONTH) + " ||| " + gregorianCalendar.get(Calendar.MONTH));

        Calendar utcCal = Calendar.getInstance(TimeZone.getTimeZone(ZoneId.of("UTC")), Locale.ENGLISH);
        System.out.println(utcCal.get(Calendar.DAY_OF_WEEK) + " |||| " + utcCal.get(Calendar.DAY_OF_YEAR)
                + " |||| " + utcCal.get(Calendar.WEEK_OF_MONTH) + " |||| " + utcCal.get(Calendar.MONTH));

        String dateString = "10/01/2020";
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d = LocalDate.parse(dateString, f);
        LocalDate ld = d.plusDays(10);
        System.out.println(ld.format(formatter2));

        String dateTimeString = "10 01 2020 10:00";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MM yyyy HH:mm");
        LocalDateTime dateTimeF = LocalDateTime.parse(dateTimeString, dateTimeFormatter);
        LocalDateTime dt = dateTimeF.plusMinutes(10);
        DateTimeFormatter dateTimeFormatterNew = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        System.out.println(dt.format(dateTimeFormatterNew));

    }
}
