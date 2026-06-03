public class Main {

    public static void main(String[] args) {
        String str = "12345";
        int num = toInteger(str);
        System.out.println("The integer value is: " + num);

        str = "-12345";
        num = toInteger(str);
        System.out.println("The integer value is: " + num);

        str = "20a";
        num = toInteger(str);
        System.out.println("The integer value is: " + num);

    }

    public static int toInteger(String str) {
        int result = 0;
        boolean negative = false;

        for (int n = 0; n < str.length(); n++) {
            char ch = str.charAt(n);
            if ((n == 0) && (ch == '-')) {
                negative = true;
                continue;
            }

            if (!isDigit(ch))
                return 0;

            int digit = ch - '0';
            result = result * 10 + digit;
        }

        return negative ? -result : result;
    }

    public static boolean isDigit(char ch) {
        return (ch >= '0') && (ch <= '9');
    }
}