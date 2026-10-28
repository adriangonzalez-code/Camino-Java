package com.driagon;

import java.util.Calendar;
import java.util.Date;

public class DateParser {

    public static Date parseDate(String strDate) {
        if (strDate == null || strDate.length() == 0) {
            return null; // Retorna null si la cadena de fecha es nula o vacía
        }

        int date, month, year;
        int idx0 = strDate.indexOf('/');
        if (idx0 == -1) {
            return null; // Retorna null si no se encuentra el primer separador '/'
        }

        String tmp = strDate.substring(0, idx0);
        date = Integer.parseInt(tmp); // Convierte el día a un entero utilizando el método parseInt() de la clase Integer

        if (date < 0 || date > 31) {
            return null; // Retorna null si el día no está en el rango válido (1-31)
        }

        int idx1 = strDate.indexOf('/', idx0 + 1);
        if (idx1 == -1) {
            return null; // Retorna null si no se encuentra el segundo separador '/'
        }
        tmp = strDate.substring(idx0 + 1, idx1);
        month = Integer.parseInt(tmp); // Convierte el mes a un entero utilizando el método parseInt() de la clase Integer

        if ((month < 1 || month > 12)) {
            return null; // Retorna null si el mes no está en el rango válido (1-12)
        }

        tmp = strDate.substring(idx1 + 1);
        year = Integer.parseInt(tmp); // Convierte el año a un entero utilizando el método parseInt() de la clase Integer

        if (year < 1970 || year > 2099) {
            return null; // Retorna null si el año no está en el rango válido (1970-2100)
        }

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DATE, date); // Establece el día en el objeto Calendar
        cal.set(Calendar.MONTH, month - 1); // Establece el mes en el objeto Calendar (restando 1 ya que los meses en Calendar son indexados desde 0)
        cal.set(Calendar.YEAR, year); // Establece el año en el objeto Calendar
        cal.set(Calendar.HOUR_OF_DAY, 0); // Establece la hora en el objeto Calendar a 0 (medianoche)
        cal.set(Calendar.MINUTE, 0); // Establece los minutos en el objeto Calendar a 0
        cal.set(Calendar.SECOND, 0); // Establece los segundos en el objeto Calendar a 0
        cal.set(Calendar.MILLISECOND, 0); // Establece los milisegundos en el objeto Calendar a 0

        return cal.getTime(); // Retorna la fecha completa como un objeto Date
    }

    static void main() {
        String strDate = "15/10/2026"; // Ejemplo de cadena de fecha en formato "dd/MM/yyyy"
        Date date = parseDate(strDate); // Llama al método parseDate() para convertir la cadena de fecha a un objeto Date

        System.out.println(date); // Imprime la fecha resultante en la consola
    }
}