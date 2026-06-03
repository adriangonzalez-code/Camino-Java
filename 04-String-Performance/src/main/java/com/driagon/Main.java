package com.driagon;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        appendTest1();
        appendTest2();
    }

    public static void appendTest1() {
        long start = System.currentTimeMillis();
        String s = "Hola Mundo ";

        for (int i = 0; i < 100000; i++) {
            s += i;
        }

        long end = System.currentTimeMillis();

        System.out.println("Tiempo de ejecución: " + (end - start) + " ms");
    }

    public static void appendTest2() {
        long start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("Hola Mundo ");

        for (int i = 0; i < 100000; i++) {
            sb.append(i);
        }

        long end = System.currentTimeMillis();

        System.out.println("Tiempo de ejecución: " + (end - start) + " ms");
    }
}
