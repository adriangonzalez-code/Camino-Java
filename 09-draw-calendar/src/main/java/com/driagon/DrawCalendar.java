package com.driagon;

import java.time.LocalDate;

public class DrawCalendar {

    /*
     * Draws a calendar for the specified month and year.
     * Example:
        +-----------------------------------------+
        |              Octubre 2026               |
        +-----------------------------------------+
        | Dom | Lun | Mar | Mie | Jue | Vie | Sab |
        +-----+-----+-----+-----+-----+-----+-----+
        |     |     |     |     |   1 |   2 |   3 |
        |   4 |   5 |   6 |   7 |   8 |   9 |  10 |
        |  11 |  12 |  13 |  14 |  15 |  16 |  17 |
        |  18 |  19 |  20 |  21 |  22 |  23 |  24 |
        |  25 |  26 | [27]|  28 |  29 |  30 |  31 |
        +-----+-----+-----+-----+-----+-----+-----+
     */

    private static final String DIVLINE = "+-----+-----+-----+-----+-----+-----+-----+";
    private static final String[] MONTHS = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
    };

    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        int month = ld.getMonthValue();
        int year = ld.getYear();

        String title = MONTHS[month - 1] + " " + year;

        System.out.println("+-----------------------------------------+");
        System.out.print("|");
        int x = 1;
        while (x < (DIVLINE.length() / 2) - (title.length() / 2)) {
            System.out.print(" ");
            x++;
        }
        System.out.print(title);
        x = x + title.length();

        while (x < (DIVLINE.length() - 1)) {
            System.out.print(" ");
            x++;
        }
        System.out.println("|");
        System.out.println(DIVLINE);
        System.out.println("| Dom | Lun | Mar | Mie | Jue | Vie | Sab |");
        System.out.println(DIVLINE);

        boolean pipe = false;
        int dayStart = (ld.minusDays(ld.getDayOfMonth() - 1).getDayOfWeek().getValue()) % 7;
        x = 0;
        if (x < dayStart) {
            System.out.print("|");
            while (x < dayStart) {
                System.out.print("     |");
                x++;
            }
            pipe = true;
        }
        for (int n = 0; n < ld.lengthOfMonth(); n++) {
            if (x > 6) {
                System.out.println();
                x = 0;
                pipe = false;
            }

            if (!pipe) {
                System.out.print("|");
                pipe = true;
            }

            if ((n + 1) == ld.getDayOfMonth()) {
                System.out.printf(" [%2d]|", n + 1);
            } else {
                System.out.printf("  %2d |", n + 1);
            }
            x++;
        }

        while (x < 7) {
            System.out.print("     |");
            x++;
        }

        System.out.println();

        System.out.println(DIVLINE);

        System.out.println();
    }
}