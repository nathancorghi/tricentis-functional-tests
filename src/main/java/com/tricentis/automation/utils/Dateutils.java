package com.tricentis.automation.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Dateutils {

    private static SimpleDateFormat formatter;

    private static Calendar calendar;

    public static String getActualDate() {

        formatter = new SimpleDateFormat("MM/dd/yyyy");

        return formatter.format(new Date());
    }

    public static String getRandomBirthDate() throws InterruptedException {

        formatter = new SimpleDateFormat("MM/dd/yyyy");

        calendar = GregorianCalendar.getInstance();

        int month = IntegerUtils.random(1, 12);
        int day = IntegerUtils.random(1, 28);
        int year = IntegerUtils.random(calendar.get(Calendar.YEAR) - 40, calendar.get(Calendar.YEAR) - 20);

        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DATE, day);

        return formatter.format(calendar.getTime());
    }

    public static String getDateWithFutureMonth() {

        formatter = new SimpleDateFormat("MM/dd/yyyy");

        calendar = GregorianCalendar.getInstance();

        calendar.add(Calendar.MONTH, 2);

        return formatter.format(calendar.getTime());
    }
}