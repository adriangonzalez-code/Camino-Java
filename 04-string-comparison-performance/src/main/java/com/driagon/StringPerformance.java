package com.driagon;

public class StringPerformance {
    static void main() {
        stringConcatenationPerformance();
        stringBuilderPerformance();
        stringFormatPerformance();
    }

    private static void stringConcatenationPerformance() {
        long start  = System.currentTimeMillis();
        String s = "Hola mundo ";
        for (int i = 0; i < 100000; i++) {
            s += i;
        }
        long end = System.currentTimeMillis();
        System.out.println("stringConcatenationPerformance - Tiempo transcurrido: " + (end - start) + " ms");
    }

    private static void stringBuilderPerformance() {
        long start  = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("Hola mundo ");
        for (int i = 0; i < 100000; i++) {
            sb.append(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("stringBuilderPerformance - Tiempo transcurrido: " + (end - start) + " ms");
    }

    private static void stringFormatPerformance() {
        long start  = System.currentTimeMillis();
        String s = "Hola mundo ";
        for (int i = 0; i < 100000; i++) {
            s = String.format("%s%d", s, i);
        }
        long end = System.currentTimeMillis();
        System.out.println("stringFormatPerformance - Tiempo transcurrido: " + (end - start) + " ms");
    }
}