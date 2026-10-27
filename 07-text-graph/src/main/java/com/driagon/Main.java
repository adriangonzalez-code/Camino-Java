package com.driagon;

public class Main {
    public static void main(String[] args) {
        TextGraph2 graph = new TextGraph2(180, 25);
        graph.rectangle(0, 0, graph.getWidth() - 1, graph.getHeight() - 1);
        for (int x = 1; x < graph.getWidth(); x++) {
            double value = Math.sin(Math.toRadians((2 * 360.0) / graph.getWidth()) * x);
            value = value * (((double) graph.getHeight() / 2) - 2);
            graph.setCharAt(x, (int) ((double) graph.getHeight() / 2 - value), 'x');
        }
        graph.println();
    }
}