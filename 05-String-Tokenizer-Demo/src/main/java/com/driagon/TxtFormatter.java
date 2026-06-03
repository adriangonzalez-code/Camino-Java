package com.driagon;

import java.util.StringTokenizer;

public class TxtFormatter {

    public static void main(String[] args) {
        String message = "No cabe duda que la parte más importa de cualquier lenguaje de programación es su sintaxis, ya que es la que permite a los programadores expresar sus ideas de manera clara y concisa. Sin embargo, la sintaxis no es lo único importante en un lenguaje de programación. La semántica también juega un papel crucial, ya que es la que define el significado de las instrucciones y cómo se ejecutan en un programa de computadora. Además, es fundamental entender que el desarrollo de software no se limita únicamente a escribir código funcional. Implica un proceso riguroso de diseño, pruebas y mantenimiento. La legibilidad del código es un factor determinante para el éxito a largo plazo de cualquier proyecto, ya que el código se lee muchas más veces de las que se escribe. Un buen programador debe preocuparse por la arquitectura, los patrones de diseño y la eficiencia algorítmica. En el ecosistema de Java, contamos con herramientas poderosas como el Garbage Collector, la Máquina Virtual de Java (JVM) y una biblioteca estándar inmensa que facilita la creación de aplicaciones robustas, escalables y seguras. El aprendizaje continuo es la única constante en esta industria tecnológica que evoluciona a pasos agigantados, donde nuevas librerías y frameworks aparecen cada día para resolver problemas complejos de formas más sencillas.";

        int lineWidth = 40;
        System.out.println();

        for (int i = 0; i < lineWidth; i++) {
            if ((i + 1) % 10 == 0) {
                System.out.print(((i / 10) + 1) % 10);
            } else {
                System.out.print(" ");
            }
        }

        System.out.println();

        for (int i = 0; i < lineWidth; i++) {
            System.out.print((i + 1) % 10);
        }

        System.out.println();

        for (int i = 0; i < lineWidth; i++) {
            System.out.print("-");
        }
        System.out.println();

        int curPos = 0;
        boolean space = false;
        StringTokenizer st = new StringTokenizer(message);
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