package com.driagon;

import java.util.Calendar;
import java.util.Date;

public class DateParser {

    public Date parseDate(String strDate) {
        int date, month, year;

        if ((strDate == null) || (strDate.isEmpty())) {
            return null;
        }

        int idx0 = strDate.indexOf("/");
        if (idx0 == -1) {
            return null; // Fecha inválida
        }

        String tmp = strDate.substring(0, idx0);
        date = Integer.parseInt(tmp);

        if (date < 0 || date > 31) {
            return null; // Fecha inválida
        }

        int idx1 = strDate.indexOf("/", idx0 + 1);
        if (idx1 == -1) {
            return null; // Fecha inválida
        }

        tmp = strDate.substring(idx0 + 1, idx1);
        month = Integer.parseInt(tmp);

        if (month < 1 || month > 12) {
            return null; // Mes inválido
        }

        tmp = strDate.substring(idx1 + 1);
        year = Integer.parseInt(tmp);

        if (year < 1970 || year > 2099) {
           return null; // Año inválido
        }

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DATE, date);
        cal.set(Calendar.MONTH, month - 1);
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);

        return cal.getTime();
    }
}