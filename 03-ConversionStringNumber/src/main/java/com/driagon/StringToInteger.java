package com.driagon;

public class StringToInteger {

    public static boolean isDigit(char ch) {
        return (ch >= '0' && ch <= '9');
    }

    static int toInteger(String s) {
        int result = 0;
        boolean negative = false;

        for (int n = 0; n < s.length(); n++) {
            char ch = s.charAt(n);
            if((n == 0) && (ch == '-')) {
                negative = true;
                continue;
            }
            if (!isDigit(ch)) {
                return 0;
            }

            int digit = ch - '0';
            result = result * 10 + digit;
        }

        if (negative)
            return -result;
        else
            return result;
    }

    static void main() {
        String s = "-20201";
        int res = toInteger(s);
        System.out.println(res);
    }
}