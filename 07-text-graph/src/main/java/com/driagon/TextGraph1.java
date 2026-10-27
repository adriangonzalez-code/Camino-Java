package com.driagon;

public class TextGraph1 {

    private char canvas[][];

    public TextGraph1(int cols, int rows) {
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

    /*
        * Draws a line from (x, y1) to (x2, y2) using Bresenham's line algorithm.
        +--------+
        |        |
        |        |
        |        |
        +--------+
     */
    public void rectangle(int x, int y, int width, int height) {
        for (int row = y; row < (y + height); row++) {
            setCharAt(x, row, '|');
            setCharAt(x + width, row, '|');
        }

        for (int col = x; col < (x + width); col++) {
            setCharAt(col, y, '-');
            setCharAt(col, (y + height), '-');
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
}