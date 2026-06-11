package com.driagon;

import java.time.LocalDate;

public class TextCalendar {

    public static final String DIV_LINE = "+-----+-----+-----+-----+-----+-----+-----+";
    public static final String[] MONTH_NAMES = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        String title = MONTH_NAMES[ld.getMonthValue() -1 ].concat(" ").concat(String.valueOf(ld.getYear()));

        System.out.println("+-----------------------------------------+");
        System.out.print("|");
        int x = 1;
        while (x < (DIV_LINE.length()/2 - title.length()/2)) {
            System.out.print(" ");
            x++;
        }
        System.out.print(title);
        x = x + title.length();
        while (x < (DIV_LINE.length() - 1)) {
            System.out.print(" ");
            x++;
        }
        System.out.println("|");
        System.out.println(DIV_LINE);
        System.out.println("| Dom | Lun | Mar | Mie | Jue | Vie | Sab |");
        System.out.println(DIV_LINE);


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
                pipe = false;
                System.out.println();
                x = 0;
            }
            if (!pipe) {
                System.out.print("|");
                pipe = true;
            }

            if (n+1 == ld.getDayOfMonth()) {
                System.out.printf(" [%2d]|", n+1);
                x++;
            } else {
                System.out.printf("  %2d |", n + 1);
                x++;
            }
        }

        while (x < 7) {
            System.out.print("     |");
            x++;
        }

        System.out.println();

        System.out.println(DIV_LINE);
    }
}