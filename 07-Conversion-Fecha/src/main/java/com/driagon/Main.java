package com.driagon;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        DateParser parser = new DateParser();
        Date date = parser.parseDate("01/12/2020");
        System.out.println(date);
    }
}