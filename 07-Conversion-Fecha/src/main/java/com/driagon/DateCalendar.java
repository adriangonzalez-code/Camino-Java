package com.driagon;

import java.util.Calendar;
import java.util.Date;

public class DateCalendar {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());
        cal.add(Calendar.DATE, 1);
        cal.add(Calendar.HOUR, 1);

        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int date = cal.get(Calendar.DATE);

        System.out.println("year = " + year);
        System.out.println("month = " + (month + 1));
        System.out.println("date = " + date);
    }
}