package com.driagon;

public class Main {

    public static void main(String[] args) {
        TextGraph graph = new TextGraph(160, 25);
        graph.rectangle(0,0, graph.getWidth() - 1, graph.getHeight() - 1);

        /** Graph a sin(x)
         */
        for (int x = 0; x < graph.getWidth(); x++) {
            double value = Math.sin(Math.toRadians((4 *360.0/graph.getWidth()) * x));
            value = value * (((double) graph.getHeight() / 2) - 2);
            graph.setCharAt(x, (int)((double) graph.getHeight() / 2 - value), 'x');
        }

        /** Graph b cos(x)
         */
        for (int x = 0; x < graph.getWidth(); x++) {
            double value = Math.cos(Math.toRadians((4 *360.0/graph.getWidth()) * x));
            value = value * (((double) graph.getHeight() / 2) - 2);
            graph.setCharAt(x, (int)((double) graph.getHeight() / 2 - value), 'x');
        }

        graph.println();
    }
}