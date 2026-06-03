package com.driagon;

import java.util.StringTokenizer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        String str = "1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20";
        StringTokenizer st = new StringTokenizer(str, ",");

        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            System.out.println(token);
        }
    }
}