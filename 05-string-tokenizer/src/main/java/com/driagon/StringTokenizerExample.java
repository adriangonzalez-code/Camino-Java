package com.driagon;

import java.util.StringTokenizer;

public class StringTokenizerExample {

    public static void main(String[] args) {
        String datos = "10,20,30,40,50"; // Cadena de texto con datos numéricos separados por comas
        StringTokenizer tokenizer = new StringTokenizer(datos, ","); // Crea un objeto StringTokenizer con el delimitador ","

        System.out.println("Tokens individuales:");
        while (tokenizer.hasMoreTokens()) { // Itera mientras haya más tokens disponibles
            String token = tokenizer.nextToken(); // Obtiene el siguiente token
            System.out.println(token); // Imprime el token en la consola
        }
    }
}