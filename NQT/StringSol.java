class StringSol {
    public static int myAtoi(String s) {
        int i = 0, n = s.length();
        if (n == 0) return 0;

        // 1. Skip leading spaces
        while (i < n && s.charAt(i) == ' ')
            i++;

        // 2. Handle sign
        int sign = 1;
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-') sign = -1;
            i++;
        }

        // 3. Convert digits
        long num = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            num = num * 10 + digit;

            // Check overflow during conversion
            if (sign * num > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if (sign * num < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;

            i++;
        }

        return (int)(sign * num);
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("  -0012gfg4")); // -12
        System.out.println(myAtoi("1231231231311133")); // 2147483647
        System.out.println(myAtoi("-999999999999")); // -2147483648
        System.out.println(myAtoi("  -")); // 0
    }
}
