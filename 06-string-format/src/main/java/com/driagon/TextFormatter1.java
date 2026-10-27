package com.driagon;

import java.util.StringTokenizer;

public class TextFormatter1 {

    public static void main(String[] args) {
        String str = "La contabilidad es el proceso de registrar, clasificar y resumir las transacciones financieras de una empresa para proporcionar información útil en la toma de decisiones. La contabilidad se basa en principios y normas contables que guían la forma en que se registran y presentan los datos financieros. Los estados financieros, como el balance general y el estado de resultados, son herramientas clave que permiten a los interesados evaluar la salud financiera de una organización y tomar decisiones informadas sobre inversiones, préstamos y otras actividades económicas.";

        int lineWidth = 40;

        System.out.println();

        for (int n = 0; n < lineWidth; n++) {
            if ((n + 1) % 10 == 0) {
                System.out.print(((n/10) + 1) % 10);
            } else {
                System.out.print(" ");
            }
        }

        System.out.println();

        for (int n = 0; n < lineWidth; n++) {
            System.out.print(((n + 1) % 10));
        }

        System.out.println();
        for (int n = 0; n < lineWidth; n++) {
            System.out.print("-");
        }

        System.out.println();

        int curPos = 0;
        boolean space = false;
        StringTokenizer st = new StringTokenizer(str);

        while (st.hasMoreTokens()) {
            String s = st.nextToken();
            if ((curPos + s.length()) > lineWidth) {
                System.out.println();
                curPos = 0;
                space = false;
            }

            if (space) {
                System.out.print(" ");
            }

            System.out.print(s);
            curPos += s.length() + 1;
            space = true;
        }

        System.out.println();
    }
}