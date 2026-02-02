class ToggleBits {
    public static String toggleBits(int n) {
        String res = "";

        while (n > 0) {
            int bit = n % 2;          // get last bit
            res = (bit == 0 ? "1" : "0") + res;  // toggle and prepend
            n = n / 2;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(toggleBits(10)); // 0101
    }
}
