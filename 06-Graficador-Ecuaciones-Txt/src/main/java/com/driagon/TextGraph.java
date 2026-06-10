package com.driagon;

public class TextGraph {

    private char[][] canvas;

    public TextGraph(int cols, int rows) {
        canvas = new char[rows][cols];
        clear();
    }

    public void clear() {
        for (int r = 0; r < canvas.length; r++) {
            for (int c = 0; c < canvas[r].length; c++) {
                canvas[r][c] = ' ';
            }
        }
    }

    public void setCharAt(int col, int row, char value) {
        if ((col < 0) || (col >= canvas[0].length) || (row < 0) || (row >= canvas.length)) {
            return;
        }

        canvas[row][col] = value;
    }

    public void rectangle(int x, int y, int width, int height) {
        for (int row = y; row < (y + height); row++) {
            setCharAt(x, row, '|');
            setCharAt(x + width, row, '|');
        }

        for (int col = x; col < (x + width); col++) {
            setCharAt(col, y, '-');
            setCharAt(col, y + height, '-');
        }

        setCharAt(x, y, '+');
        setCharAt(x + width, y, '+');
        setCharAt(x, y + height, '+');
        setCharAt(x + width, y + height, '+');
    }

    public void println() {
        for (int row = 0; row < canvas.length; row++) {
            System.out.println(canvas[row]);
        }

        System.out.println();
    }

    public int getWidth() {
        return canvas[0].length;
    }

    public int getHeight() {
        return canvas.length;
    }
}