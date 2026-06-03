package org.driagon.arbol;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static void main(String[] args) {
        int size = 17;  // Altura del arbol
        int n = 1;      // Número de caracteres a imprimir en cada fila

        while(n <= size) {
            for (int i = 0; i < (size/2)-(n/2); i++)
                System.out.print(" ");
            for (int i = 0; i < n; i++)
                System.out.print("*");
            System.out.println();
            n+=2;
        }

        for (n = 0; n < 2; n++) {
            for (int i = 0; i < (size/2) - 1; i++)
                System.out.print(" ");
            System.out.println("|  |");
        }
    }
}
